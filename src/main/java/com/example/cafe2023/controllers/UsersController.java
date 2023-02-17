package com.example.cafe2023.controllers;

import com.example.cafe2023.bean.Users;
import com.example.cafe2023.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

//    public UsersController(UsersService usersService) {
//        this.usersService = usersService;
//    }

    @GetMapping("/users")
    public String findAll(Model model) {
        List<Users> users = usersService.findAll();
        model.addAttribute("users", users);
        //model добавь в себя атрибут под названием юзерс(то что у нас указано на html стp,
        //и сюда положи юзера, которого получили в результате данного запроса.
        return "user-list";
        // userList путь к  html файлу
        //Model - аналог мапы, куда ложим атрибуты.
    }

//    @GetMapping("/user-сreate")
//    public String createUsersForm(Users user) {
//        return "user-create";
//    }
//    // Создание пользователя.
//    // Сохранение в базу данных.
//    // Перехрдим на страницу user-list.
//    @PostMapping
//        public String createUser(Users user) {
//        usersService.saveUser(user);
//        return "redirect:/users";
//        }
//
//    @GetMapping("user-delete/{id}")
//    public String deleteUser(@PathVariable("id") Long id){
//        usersService.deleteById(id);
//        return "redirect:/users";
    }




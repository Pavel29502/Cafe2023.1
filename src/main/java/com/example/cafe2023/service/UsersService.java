package com.example.cafe2023.service;

import com.example.cafe2023.bean.Users;
import com.example.cafe2023.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {
    @Autowired

    private UsersRepository usersRepository;

    public List<Users> findAll() {
        System.out.println(usersRepository.findAll());
        return usersRepository.findAll();
    }
    public List<Users> findByName(String name) {
        return usersRepository.findByName(name);
    }
    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }
    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }

}



package com.example.cafe2023.repository;

import com.example.cafe2023.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {
//    UsersRepository(UsersRepository usersRepository) {
//        this.usersRepository = usersRepository;
//    }
    List<Users> findByName(String name);
    List<Users> findUserByEmail(String email);
    boolean existsUserByEmail(String email);
    void deleteById(Long id);

}

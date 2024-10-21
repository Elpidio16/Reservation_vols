package com.monprojet.demo.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monprojet.demo.models.Users;
import com.monprojet.demo.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public Users createUsers(Users users) {
        return usersRepository.save(users);
    }

    public Optional<Users> getUsersByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

}

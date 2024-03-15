package com.harris.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harris.log.domain.login;
import com.harris.log.repository.logrepo;

@Service
public class LogService {
    @Autowired
    private logrepo rep;

    public login log(String username, String password){
        login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}

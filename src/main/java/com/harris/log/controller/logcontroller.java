package com.harris.log.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.harris.log.domain.login;
import com.harris.log.service.LogService;

@Controller
public class logcontroller {
    @Autowired
    private LogService service;

    @GetMapping("/")
    public String home(Model model) {
        return "log";
    }

     @PostMapping("/log")
    public String login(@ModelAttribute("user") login user) {
 
        login oauthUser = service.log(user.getUsername(), user.getPassword());

        if (Objects.nonNull(oauthUser)) {
            return "redirect:/disp";
        } else {
            return "redirect:/";
        }
        }
        
        @GetMapping("/disp")
        public String display() {
        return "disp";
        }
}



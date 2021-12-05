package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
       return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/fullstack")
    public String heyHello()
    {
        return "Welcome to Full stack";
    }

}

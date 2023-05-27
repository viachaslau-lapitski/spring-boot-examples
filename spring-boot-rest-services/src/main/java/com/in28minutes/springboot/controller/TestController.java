package com.in28minutes.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")
public class StudentController {

    @GetMapping("/ping")
    public String ping() {
        return "Pong !!!";
    }

}

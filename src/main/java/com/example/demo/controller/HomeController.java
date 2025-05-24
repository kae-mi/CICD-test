package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "cicd-test";
    }

    @GetMapping("/test1")
    public String test1() {
        return "cicd-test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "cicd-test2";
    }
}

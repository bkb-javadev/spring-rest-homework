package com.arsen.restacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @ResponseBody
    @GetMapping("/say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @ResponseBody
    @PostMapping("/say")
    public String sayHelloAndName(@RequestParam("name") String name) {
        return "Hello, " + name + '!';
    }
}

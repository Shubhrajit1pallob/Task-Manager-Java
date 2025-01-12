package com.example.task_manager.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TaskController {

    @RequestMapping("/")
    public String index() {
        return "Spring Boot Task Manager";
    }

}

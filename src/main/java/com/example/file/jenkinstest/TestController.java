package com.example.file.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping
    public String getMapping(){
        return "Hello Jenkins";
    }
}

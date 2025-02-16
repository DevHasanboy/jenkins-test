package com.example.file.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/get")
    public String getMapping(){
        return "Hello Jenkins";
    }

    @GetMapping("/get-message")
    public String getMessage(){
        return "Hi Guys";
    }
}

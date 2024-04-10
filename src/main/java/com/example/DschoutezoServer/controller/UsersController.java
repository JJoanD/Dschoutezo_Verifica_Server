package com.example.DschoutezoServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    
    @GetMapping("http://localhost:8080")
    public void home(){
        
    }
}

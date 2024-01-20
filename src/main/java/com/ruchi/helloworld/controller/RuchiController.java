package com.ruchi.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuchiController {

    @GetMapping("/hello")
    public String helloNumber(){
        return "Hello Ruchi, this is one random number : " + Math.random();
    }
}

package com.example.oyomm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trains {

    @GetMapping("/trains")

    public String getData() {return "Please book trains tickets at 15 % discount" ; }
}
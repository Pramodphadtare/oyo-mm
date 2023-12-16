package com.example.oyomm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotels {

    @GetMapping("/Hotels")

    public String getData() {return "Please book Hotels tickets at 15 % discount" ; }
}

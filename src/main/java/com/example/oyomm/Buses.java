package com.example.oyomm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Buses {

    @GetMapping("/Buses")

    public String getData() {return "Please book Buses tickets at 15 % discount" ; }
}

package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("V1")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "Welcome to Credit System India pune";
    }


    @GetMapping("/address")
    public String address()
    {
        return "Inspiria Mall |Pune";
    }
}

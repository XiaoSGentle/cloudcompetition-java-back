package com.xiaos.cloud.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {

    @GetMapping("/test")
    public void getBase(){

    }
}

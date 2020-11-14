package com.liwenli.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @RequestMapping("/")
    public String home() {
        return "hello spring boot!";
    }
}

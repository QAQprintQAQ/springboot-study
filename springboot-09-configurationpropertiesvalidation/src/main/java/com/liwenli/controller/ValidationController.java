package com.liwenli.controller;

import com.liwenli.model.ValidationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @Autowired//注入
    private ValidationProperties validationProperties;

    @RequestMapping("/validation")
    public String validate() {
        System.out.println(validationProperties);
        return "validation";
    }
}

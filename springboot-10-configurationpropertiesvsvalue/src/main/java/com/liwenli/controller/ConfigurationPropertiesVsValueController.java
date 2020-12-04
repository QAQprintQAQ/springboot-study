package com.liwenli.controller;

import com.liwenli.model.ConfigurationPropertiesProperties;
import com.liwenli.model.ValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationPropertiesVsValueController {

    @Autowired//注入
    private ConfigurationPropertiesProperties configurationPropertiesProperties;

    @RequestMapping("/configurationpropertiesproperties")
    public String ConfigurationPropertiesProperties() {
        System.out.println(configurationPropertiesProperties);
        return "ConfigurationPropertiesProperties";
    }


    @Autowired//注入
    private ValueProperties valueProperties;

    @RequestMapping("/valueproperties")
    public String valueProperties() {
        System.out.println(valueProperties);
        return "ValueProperties";
    }


}

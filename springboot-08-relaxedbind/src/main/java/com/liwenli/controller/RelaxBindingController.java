package com.liwenli.controller;

import com.liwenli.model.AcmeProperties;
import com.liwenli.model.OwnerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//保证这个类在主启动类的扫描范围之内即可，不需要再加@Configuration这个注解表示配置类了
public class RelaxBindingController {

    @Autowired//对AcmeProperties进行注入
    private AcmeProperties acmeProperties;

    @Autowired//对PersonProperties进行注入
    private OwnerProperties ownerProperties;

    @RequestMapping("/relaxbinding")
    public String relaxBinding() {
        System.out.println(acmeProperties);
        return "relaxBinding acmeProperties";
    }

    @RequestMapping("/relaxbind")
    public String relaxBind() {
        System.out.println(ownerProperties);
        return "relaxBind ownerProperties";
    }
}

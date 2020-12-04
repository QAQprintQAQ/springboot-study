package com.liwenli.controller;

import com.liwenli.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(AcmeProperties.class)
@RestController
public class ProfileController {

    @Autowired//对AcmeProperties属性进行自动注入
    private AcmeProperties acmeProperties;

    @RequestMapping("/profile")
    public AcmeProperties profile() {
        System.out.println(acmeProperties);
        return acmeProperties;
//        System.out.println(acmeProperties);//不能放在return语句的后面了，return表示函数返回结束了

    }
}

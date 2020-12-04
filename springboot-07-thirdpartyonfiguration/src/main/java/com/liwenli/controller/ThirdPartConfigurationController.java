package com.liwenli.controller;

import com.liwenli.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//保证这个类在主启动类的扫描范围之内即可，不需要再加@Configuration这个注解表示配置类了
public class ThirdPartConfigurationController {

    @Autowired//对AcmeProperties进行注入
    private AcmeProperties acmeProperties;

    @RequestMapping("/thirdpartconfiguration")
    public String thirdPartConfiguration() {
        System.out.println(acmeProperties);
        return "third-part configuration";
    }


}

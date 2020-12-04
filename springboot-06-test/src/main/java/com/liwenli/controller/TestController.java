package com.liwenli.controller;

import com.liwenli.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Configuration//因为主启动类已经有@Configuration注解，因此被主启动类扫描的类都不需要使用@Configuration就能有@Configuration的功能了！
@RestController("/test")
public class TestController {

    @Bean
    public TestModel getTestModel() {
        return new TestModel();
    }

    @Autowired
    private TestModel testModel;

    @RequestMapping("/test")
    public String test() {

        System.out.println(testModel);
        return "hello springboot!";
    }

}

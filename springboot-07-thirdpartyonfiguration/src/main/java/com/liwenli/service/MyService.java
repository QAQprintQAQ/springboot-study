package com.liwenli.service;

import com.liwenli.model.AcmeProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service//保证这个类在主启动类的扫描范围之内即可，不需要再加@Configuration这个注解表示配置类了
public class MyService {

    @Bean
    @ConfigurationProperties("acme")//这个MyService.java就是充当第三方组件，用来注入AcmeProperties.java的属性！！
    public AcmeProperties getAcmeProperties() {
        return new AcmeProperties();
    }
}

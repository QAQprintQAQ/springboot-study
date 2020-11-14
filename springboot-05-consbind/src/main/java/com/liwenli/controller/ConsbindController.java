package com.liwenli.controller;

import com.liwenli.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(AcmeProperties.class)//需要导入class包
/*
要使用构造函数绑定，必须使用@EnableConfigurationProperties或配置属性扫描启用类。
不能对由常规Spring机制创建的Bean使用构造函数绑定（例如@Component Bean、通过@Bean方法创建的Bean或使用@Import加载的Bean）

在springboot-04-propbind属性绑定的案例中我们同样也可以使用@EnableConfigurationProperties，此时不需要提供@Component
如果一个配置类只配置@ConfigurationProperties注解，而没有使用@Component，那么在IOC容器中是获取不到properties 配置文件转化的bean。
说白了 @EnableConfigurationProperties 相当于把使用 @ConfigurationProperties 的类进行了启用注入。
 */
@RestController
public class ConsbindController {

    @Autowired//对AcmeProperties属性进行自动注入
    private AcmeProperties acmeProperties;

    @RequestMapping("/consbind")
    public AcmeProperties consbind() {
        System.out.println(acmeProperties);
        return acmeProperties;
//        System.out.println(acmeProperties);//不能放在return语句的后面了，return表示函数返回结束了
    }
}

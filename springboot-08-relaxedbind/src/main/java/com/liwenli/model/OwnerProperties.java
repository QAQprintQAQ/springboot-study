package com.liwenli.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data//lombok注解
@Component//表示spring ioc的一个bean
@ConfigurationProperties("acme.my-project.person")//在属性类中，前缀不可以驼峰模式，只能用中划线模式，但是yml中是可以用驼峰模式来配置的
public class OwnerProperties {

    private String firstName;//驼峰形式的变量名
    private String lastName;//驼峰形式的变量名

}

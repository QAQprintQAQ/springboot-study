
package com.liwenli.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
//@Component//可以在PropbindController.java中使用@EnableConfigurationProperties(AcmeProperties.class)来将AcmeProperties.java注入spring IOC容器
//@ConfigurationProperties("acme")//这里的属性绑定一定要注释掉，要不然和第三方绑定的bean(MyService.java)中的@ConfigurationProperties("acme")会重复的绑定AcmeProperties.java的属性的值
public class AcmeProperties {

    private boolean enabled;

    private InetAddress remoteAddress;

    private final Security security = new Security();

    @Data
    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

    }
}

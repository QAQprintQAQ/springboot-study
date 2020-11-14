package com.liwenli.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import java.net.InetAddress;
import java.util.List;


//@Component//不需要使用@Component注解
@ConfigurationProperties("acme")
@ConstructorBinding//构造器绑定的注解
public class AcmeProperties {

    private boolean enabled;

    private InetAddress remoteAddress;


    private Security security;//这里不需要给初始值了 //private final Security security = new Security();//这里不需要给初始值了

    public boolean isEnabled() {
        return enabled;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public Security getSecurity() {
        return security;
    }

    public AcmeProperties(boolean enabled, InetAddress remoteAddress, Security security) {
        this.enabled = enabled;
        this.remoteAddress = remoteAddress;
        this.security = security;
    }

    public static class Security {


        private String username;

        private String password;

        private List<String> roles;

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public Security(String username, String password, List<String> roles) {
            this.username = username;
            this.password = password;
            this.roles = roles;
        }
    }
}

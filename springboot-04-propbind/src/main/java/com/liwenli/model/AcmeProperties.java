//使用getter,setter,toString方法
/*
package com.liwenli.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@ConfigurationProperties("acme")
public class AcmeProperties {

    private boolean enabled;

    private InetAddress remoteAddress;

    private final Security security = new Security();

    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }
    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
    public Security getSecurity() {
        return security;
    }
    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "Security{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", roles=" + roles +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AcmeProperties{" +
                "enabled=" + enabled +
                ", remoteAddress=" + remoteAddress +
                ", security=" + security +
                '}';
    }
}

 */


//使用lombok插件
package com.liwenli.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
//@Component//可以在PropbindController.java中使用@EnableConfigurationProperties(AcmeProperties.class)来将AcmeProperties.java注入spring IOC容器
@ConfigurationProperties("acme")
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

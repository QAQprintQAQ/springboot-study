package com.liwenli.model;
import lombok.Data;
import org.apache.tomcat.jni.BIOCallback;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.*;
//首先需要将这个类放入到spring ioc容器中进行管理需要用到@Component
@Component
/*其次需要加上一个spring boot中用来将yml配置文件中的属性绑定到类里面的属性进行注入用的注解@ConfigurationProperties
@ConfigurationProperties是有属性的，这个属性是prefix，属性的值就是当前类中属性的上一个层级，
而YamlModel.java中的属性的上一个层级对应于application.yml中的属性的上一个层级是yaml，所以prefix=="yaml"
当spring 容器把YamlModel这个bean做初始化的时候，spring容器发现YamlModel这个bean有@ConfigurationProperties这个注解，
于是spring容器就会到这个@ConfigurationProperties中找这个前缀prefix="yaml"，再进入application.yml中找到这个前缀yaml。
spring容器会将application.yml里面的yaml前缀下面的属性的值和java bean实体类（YamlModel.java）中的属性的值作匹配，
并通过java实体类中的getter,setter方法将java bean实体类（YamlModel.java）中的属性值设置成application.yml中的前缀yaml中的属性对应的value值。
 */
@Data
@ConfigurationProperties(prefix = "yml")
public class YmlModel {
    private String str;
    private int num;
    private double dnum;
    private Date birth;
    private String specialStr;
    private String specialStr2;
    private boolean flag;
    private List<String> list ;
    private Set<Integer> set;
    private Map<String, String> map;
    private User user;
}

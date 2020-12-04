package com.liwenli.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class ConfigurationPropertiesProperties {
    @NotNull//name不能为null
    private String myName;

    @Max(35)//age不超过35
    private int age;

    @Email//符合邮箱形式
    private String email;

    @Valid
    private School school = new School();

    @Data
    @ConfigurationProperties(prefix = "person.school")
    class School {

        @NotNull
        private String schoolName;
    }
}

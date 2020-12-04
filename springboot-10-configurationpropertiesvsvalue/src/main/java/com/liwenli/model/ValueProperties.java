package com.liwenli.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@Component
@Validated
public class ValueProperties {
    @NotNull//name不能为null
//    @Value("${person2.myName}")
    @Value("${person2.my-name}")
    private String myName;

    @Max(35)//age不超过35
    @Value("#{12*3}")
    private int age;

    @Email//符合邮箱形式
    @Value("${person2.email}")
    private String email;

    @Valid
    private School school = new School();

    @Data
    class School {

        @NotNull
        @Value("${person2.school.schoolName}")
        private String schoolName;
    }
}

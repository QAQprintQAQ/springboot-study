package com.liwenli.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component//将User注入到spring容器中
public class User {
    private String name;
    private int age;
    private String addr;
    private String sex;
}

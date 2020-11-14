package com.liwenli.controller;

import com.liwenli.model.YmlModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {

    @Autowired  //注入到spring中
    private YmlModel ymlModel;
    @RequestMapping("/yml")
    public YmlModel yml() {
        System.out.println(ymlModel);//在控制台中显示
        return ymlModel;//返回到视图
    }

}

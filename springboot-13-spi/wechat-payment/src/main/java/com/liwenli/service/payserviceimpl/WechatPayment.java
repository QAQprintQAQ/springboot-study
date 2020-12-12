package com.liwenli.service.payserviceimpl;

import com.liwenli.service.PayService;

public class WechatPayment implements PayService {
    @Override
    public void pay() {
        System.out.println("Wechat Payment");
    }
}

package com.liwenli.service.payserviceimpl;

import com.liwenli.service.PayService;

public class AlipayPayment implements PayService {
    @Override//实现PayService接口方法
    public void pay() {
        System.out.println("Alipay Payment");
    }
}

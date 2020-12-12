package com.liwenli.service;

import com.liwenli.service.PayService;

import java.util.ServiceLoader;

public class PayTest {
    public static void main(String[] args) {
/*
     ServiceLoader可以把main-test工程下pom.xml文件中引入的工程的PayService接口的具体实现通过ServiceLoader形式返回！
     但是这里只是将PayService接口的具体实现引入进来了，我们并不能通过ServiceLoader加载出AlipayPayment和WechatPayment，
     因为ServiceLoader并不能够发现我们引入的jar包或者是工程的依赖，也就是ServiceLoader发现不了AlipayPayment和WechatPayment!
     为了能让ServiceLoader发现并加载引入的坐标依赖，我们必须要遵守java的spi规范，
     在实现PayService接口的jar包/工程的META-INF/services目录下创建一个以“接口全路径名/全限定名”为命名的文件，内容为实现类的全限定名；
     只有这样才能够让ServiceLoader发现并加载出来。
 */
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load) {//load实现了Iterable，所以可以使用for循环遍历
            System.out.println(payService);
            payService.pay();//调用支付方法！
        }
    }
}

package com.shiyu.refect.proxy.dynamic;

/**
 * @Author: dushiyu
 * @Date: 2019-12-19 14:26
 * @Version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("你好啊...");
    }
}

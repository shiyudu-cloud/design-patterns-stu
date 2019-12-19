package com.shiyu.refect.proxy.dynamic;

/**
 * @Author: dushiyu
 * @Date: 2019-12-19 14:23
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        HelloService  bind = (HelloService)helloServiceProxy.bind(new HelloServiceImpl());
        bind.sayHello();
    }
}

package com.shiyu.refect.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: dushiyu
 * @Date: 2019-12-19 14:27
 * @Version 1.0
 */
public class HelloServiceProxy implements InvocationHandler {


    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("##########JDK 动态代理###########");

        Object invoke = method.invoke(target, args);

        return invoke;
    }
}

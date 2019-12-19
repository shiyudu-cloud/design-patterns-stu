package com.shiyu.builder;

/**
 * @Author: dushiyu
 * @Date: 2019-12-19 14:45
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        AssemblerBuilder assemblerBuilder = new AssemblerBuilder();
        Computer finish = assemblerBuilder.createCpu("1").createFinish();
        System.out.println(finish.toString());
    }
}

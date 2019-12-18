package com.shiyu.adapters;

/**
 *  适配器模式中所涉及的类，应用程序负责用Wash类创建一个对象来模拟一台洗衣机，使用TV类创建一个对象来模拟一台电视机
 * @Author: dushiyu
 * @Date: 2019-12-18 16:40
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        ThreeElectricOutlet three =new Wash();
        three.connectElectricCurrent();
        TwoElectricOutlet two =new Tv();
        ThreeClectricAdapter adapter =   new ThreeClectricAdapter(two);
        three = adapter;
        adapter.connectElectricCurrent();


        System.out.println("-------下面是双向适配器-------");
        //双向适配器
        ThreeElectricOutlet threeElectricOutlet;
        ThreeAndTwoAdapter threeAndTwoAdapter =  new ThreeAndTwoAdapter(three);
        threeElectricOutlet = threeAndTwoAdapter;
        threeElectricOutlet.connectElectricCurrent();
    }



}


/**
 *  洗衣机
 */
class Wash implements ThreeElectricOutlet {

    @Override
    public void connectElectricCurrent() {
        System.out.println("洗衣精通电开始洗衣服");
    }
}

class Tv implements TwoElectricOutlet {

    @Override
    public void connectElectricCurrent() {
        System.out.println("电视机开始播放连续剧");
    }
}
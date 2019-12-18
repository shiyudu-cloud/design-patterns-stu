package com.shiyu.adapters;

/**
 * @Author: dushiyu
 * @Date: 2019-12-18 16:38
 * @Version 1.0
 */
public class ThreeClectricAdapter implements ThreeElectricOutlet {

    private TwoElectricOutlet twoElectricOutlet;

    public ThreeClectricAdapter(TwoElectricOutlet twoElectricOutlet){
        this.twoElectricOutlet=twoElectricOutlet;
    }

    @Override
    public void connectElectricCurrent() {
        twoElectricOutlet.connectElectricCurrent();
    }
}

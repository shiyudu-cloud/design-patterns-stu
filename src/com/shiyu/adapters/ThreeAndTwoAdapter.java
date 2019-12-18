package com.shiyu.adapters;

/**
 * @Author: dushiyu
 * @Date: 2019-12-18 16:58
 * @Version 1.0
 */
public class ThreeAndTwoAdapter implements ThreeElectricOutlet,TwoElectricOutlet {

    private ThreeElectricOutlet threeElectricOutlet;

    private TwoElectricOutlet twoElectricOutlet;

    public ThreeAndTwoAdapter(TwoElectricOutlet twoElectricOutlet){

        this.twoElectricOutlet = twoElectricOutlet;
    }

    public  ThreeAndTwoAdapter(ThreeElectricOutlet threeElectricOutlet){
        this.threeElectricOutlet =threeElectricOutlet;
    }

    @Override
    public void connectElectricCurrent() {
        if (this instanceof ThreeElectricOutlet && threeElectricOutlet!= null){
            threeElectricOutlet.connectElectricCurrent();
        }
        if (this instanceof TwoElectricOutlet  && twoElectricOutlet!= null) {
            twoElectricOutlet.connectElectricCurrent();
        }
    }
}

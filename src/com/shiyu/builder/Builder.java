package com.shiyu.builder;

/**
 *
 * 抽象的构造者
 * @Author: dushiyu
 * @Date: 2019-12-19 14:47
 * @Version 1.0
 */
public interface Builder {

    Builder createMainBoard(String mainBoard) ;
    Builder createCpu(String cpu);
    Builder createHardDisk(String hardDisk);
    Builder createMemory(String memory);
    Computer createFinish();

}

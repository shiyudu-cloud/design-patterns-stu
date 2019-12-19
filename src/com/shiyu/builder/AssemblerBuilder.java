package com.shiyu.builder;

/**
 * @Author: dushiyu
 * @Date: 2019-12-19 14:56
 * @Version 1.0
 */
public class AssemblerBuilder implements Builder {

    private Computer computer = new Computer();



    @Override
    public AssemblerBuilder createMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
        return this;
    }

    @Override
    public AssemblerBuilder createCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public AssemblerBuilder createHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
        return this;
    }

    @Override
    public AssemblerBuilder createMemory(String memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public Computer createFinish() {
        return computer;
    }
}

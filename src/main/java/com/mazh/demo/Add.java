package com.mazh.demo;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 加法运算类
 */
public class Add extends Operation {

    @Override
    public double calculate() {
        return getOperandA() + getOperandB();
    }
}

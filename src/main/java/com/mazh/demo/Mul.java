package com.mazh.demo;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 乘法运算类
 */
public class Mul extends Operation {

    @Override
    public double calculate() {
        return getOperandA() * getOperandB();
    }
}

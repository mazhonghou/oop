package com.mazh.demo;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 减法运算类
 */
public class Sub extends Operation {

    @Override
    public double calculate() {
        return getOperandA() - getOperandB();
    }
}

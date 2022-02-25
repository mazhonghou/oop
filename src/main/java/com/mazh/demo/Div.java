package com.mazh.demo;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 除法运算类
 */
public class Div extends Operation {

    @Override
    public double calculate() throws Exception {
        double operandB = getOperandB();
        if(operandB==0){
            throw new Exception("被除数不能为0");
        }
        return getOperandA() / operandB;
    }
}

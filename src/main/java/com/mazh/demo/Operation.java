package com.mazh.demo;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 定义计算类
 */
public class Operation {

    /**
     * 定义两操作数A、B
     */
    private double operandA;
    private double operandB;

    public Operation() {
    }

    public Operation(double operandA, double operandB) {
        this.operandA = operandA;
        this.operandB = operandB;
    }

    public double getOperandA() {
        return operandA;
    }

    public void setOperandA(double operandA) {
        this.operandA = operandA;
    }

    public double getOperandB() {
        return operandB;
    }

    public void setOperandB(double operandB) {
        this.operandB = operandB;
    }

    public double calculate() throws Exception {
        return 0d;
    }
}

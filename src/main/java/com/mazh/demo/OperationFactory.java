package com.mazh.demo;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 定义工厂类
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        switch (operate) {
            case "-":
                return new Sub();
            case "*":
                return new Mul();
            case "/":
                return new Div();
            default:
                return new Add();
        }
    }
}

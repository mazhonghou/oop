package com.mazh.test;

import com.mazh.demo.Operation;
import com.mazh.demo.OperationFactory;

/**
 * @author mazh
 * @date 2022/2/10
 * @description 测试类
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperation("/");
        operation.setOperandA(5);
        operation.setOperandB(2);
        double result = operation.calculate();
        System.out.println(result);
    }
}

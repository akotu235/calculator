package io.github.akotu235.calculator;

import io.github.akotu235.calculator.factory.DefaultOperationFactory;
import io.github.akotu235.calculator.factory.OperationFactory;

public class Main {
    public static void main(String[] args) {
        OperationFactory factory = new DefaultOperationFactory();
        Calculator calculator = new Calculator(factory);

        System.out.println("Add: " + calculator.calculate("add", 10, 5)); // 15.0
        System.out.println("Subtract: " + calculator.calculate("subtract", 10, 5)); // 5.0
        System.out.println("Multiply: " + calculator.calculate("multiply", 10, 5)); // 50.0
    }
}
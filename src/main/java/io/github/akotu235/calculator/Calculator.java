package io.github.akotu235.calculator;

import io.github.akotu235.calculator.factory.OperationFactory;
import io.github.akotu235.calculator.operations.Operation;

public class Calculator {
    private final OperationFactory operationFactory;

    public Calculator(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public double calculate(String operationType, double a, double b) {
        Operation operation = operationFactory.createOperation(operationType);
        return operation.execute(a, b);
    }
}
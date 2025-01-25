package io.github.akotu235.calculator;

import io.github.akotu235.calculator.exception.operation.OperationException;
import io.github.akotu235.calculator.factory.OperationFactory;
import io.github.akotu235.calculator.model.Result;
import io.github.akotu235.calculator.operation.Operation;
import io.github.akotu235.calculator.model.OperationData;

public class Calculator {
    private final OperationFactory operationFactory;

    public Calculator(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public Result calculate(OperationData operationData) {
        Operation operation;
        try {
            operation = operationFactory.createOperation(operationData.getOperation());
        }
        catch (OperationException e) {
            return new Result(e.getMessage());
        }

        try{
            return new Result(operation.execute(operationData.getNumbers()));
        } catch (OperationException e) {
            return new Result(e.getMessage());
        }
    }
}
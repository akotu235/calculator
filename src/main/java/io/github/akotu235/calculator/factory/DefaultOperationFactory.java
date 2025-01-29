package io.github.akotu235.calculator.factory;

import io.github.akotu235.calculator.exception.operation.UnsupportedOperationException;
import io.github.akotu235.calculator.operation.*;

import java.util.HashMap;
import java.util.Map;

public class DefaultOperationFactory implements OperationFactory {
    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("add", new AdditionOperation());
        operations.put("+", new AdditionOperation());
        operations.put("subtract", new SubtractionOperation());
        operations.put("-", new SubtractionOperation());
        operations.put("multiply", new MultiplicationOperation());
        operations.put("*", new MultiplicationOperation());
        operations.put("divide", new DivisionOperation());
        operations.put("/", new DivisionOperation());
    }

    @Override
    public Operation createOperation(String operationType) {
        Operation operation = operations.get(operationType.toLowerCase());
        if (operation == null) {
            throw new UnsupportedOperationException("Unsupported operation: " + operationType);
        }
        return operation;
    }
}
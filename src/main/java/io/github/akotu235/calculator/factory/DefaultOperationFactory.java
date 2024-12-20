package io.github.akotu235.calculator.factory;

import io.github.akotu235.calculator.operations.*;

public class DefaultOperationFactory implements OperationFactory {
    @Override
    public Operation createOperation(String operationType) {
        return switch (operationType.toLowerCase()) {
            case "add" -> new AdditionOperation();
            case "subtract" -> new SubtractionOperation();
            case "multiply" -> new MultiplicationOperation();
            default -> throw new IllegalArgumentException("Unknown operation: " + operationType);
        };
    }
}
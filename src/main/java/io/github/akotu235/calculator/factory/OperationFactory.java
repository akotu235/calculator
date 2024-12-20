package io.github.akotu235.calculator.factory;

import io.github.akotu235.calculator.operations.Operation;

public interface OperationFactory {
    Operation createOperation(String operationType);
}

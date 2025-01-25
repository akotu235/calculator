package io.github.akotu235.calculator.operation;

import io.github.akotu235.calculator.exception.operation.OperationException;

@FunctionalInterface
public interface Operation {
    double execute(double[] args) throws OperationException;
}
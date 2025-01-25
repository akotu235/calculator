package io.github.akotu235.calculator.operation;

import io.github.akotu235.calculator.exception.operation.DivisionByZeroException;

public class DivisionOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
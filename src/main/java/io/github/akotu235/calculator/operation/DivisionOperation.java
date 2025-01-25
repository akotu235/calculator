package io.github.akotu235.calculator.operation;


public class DivisionOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
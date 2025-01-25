package io.github.akotu235.calculator.operation;

public class MultiplicationOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
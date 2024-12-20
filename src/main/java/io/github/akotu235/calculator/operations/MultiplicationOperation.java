package io.github.akotu235.calculator.operations;

public class MultiplicationOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
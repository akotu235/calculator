package io.github.akotu235.calculator.operation;

public class SubtractionOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
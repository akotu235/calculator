package io.github.akotu235.calculator.operation;

public class MultiplicationOperation implements Operation {
    @Override
    public double execute(double[] args) {
        return args[0] * args[1];
    }
}
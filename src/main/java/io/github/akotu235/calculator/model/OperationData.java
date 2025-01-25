package io.github.akotu235.calculator.model;

import java.util.Arrays;

public class OperationData {
    private String operation;
    private double[] numbers;

    public OperationData() {
    }

    public OperationData(String operation, double... numbers) {
        this.operation = operation;
        this.numbers = numbers;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "OperationData{operation='" + operation + "', numbers=" + Arrays.toString(numbers) + "}";
    }
}
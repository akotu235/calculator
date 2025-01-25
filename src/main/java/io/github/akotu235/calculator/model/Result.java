package io.github.akotu235.calculator.model;

public class Result {
    private final double result;
    private final boolean success;
    private final String errorMessage;

    public Result(double result) {
        this.result = result;
        this.success = true;
        this.errorMessage = "";
    }

    public Result(String errorMessage) {
        this.result = 0;
        this.success = false;
        this.errorMessage = errorMessage;
    }

    public double getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        if (success) {
            return "" + result;
        } else {
            return errorMessage;
        }
    }
}
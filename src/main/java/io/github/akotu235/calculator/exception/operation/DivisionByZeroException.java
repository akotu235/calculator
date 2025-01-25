package io.github.akotu235.calculator.exception.operation;

public class DivisionByZeroException extends OperationException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
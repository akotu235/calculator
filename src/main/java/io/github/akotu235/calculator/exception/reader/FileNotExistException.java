package io.github.akotu235.calculator.exception.reader;

public class FileNotExistException extends ReaderException {
    public FileNotExistException(String message) {
        super(message);
    }
}
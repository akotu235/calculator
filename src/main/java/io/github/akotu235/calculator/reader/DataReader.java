package io.github.akotu235.calculator.reader;

import io.github.akotu235.calculator.exception.reader.ReaderException;
import io.github.akotu235.calculator.model.OperationData;

public interface DataReader {
    OperationData readData() throws ReaderException;
}
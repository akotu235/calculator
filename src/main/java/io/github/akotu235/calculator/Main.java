package io.github.akotu235.calculator;

import io.github.akotu235.calculator.exception.reader.ReaderException;
import io.github.akotu235.calculator.factory.DefaultOperationFactory;
import io.github.akotu235.calculator.factory.OperationFactory;
import io.github.akotu235.calculator.model.OperationData;
import io.github.akotu235.calculator.model.Result;
import io.github.akotu235.calculator.reader.ConsoleDataReader;
import io.github.akotu235.calculator.reader.DataReader;
import io.github.akotu235.calculator.reader.JsonFileDataReader;

public class Main {
    public static void main(String[] args) {
        OperationFactory factory = new DefaultOperationFactory();
        Calculator calculator = new Calculator(factory);

        DataReader dataReader = getDataReader(args);

        try {
            OperationData operationData = dataReader.readData();
            Result result = calculator.calculate(operationData);
            printResult(result);
        } catch (ReaderException e) {
            printResult(new Result(e.getMessage()));
        }
    }

    private static DataReader getDataReader(String[] args) {
        return args.length > 0 ? new JsonFileDataReader(args[0]) : new ConsoleDataReader();
    }

    private static void printResult(Result result) {
        if (result.isSuccess()) {
            System.out.println("Result: " + result);
        } else {
            System.err.println("Error: " + result);
        }
    }
}
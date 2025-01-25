package io.github.akotu235.calculator.reader;

import io.github.akotu235.calculator.model.OperationData;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleDataReader implements DataReader {
    @Override
    public OperationData readData() {
        Scanner scanner = new Scanner(System.in);

        String operation;
        double a, b;

        while (true) {
            try {
                System.out.println("Enter operation (add, subtract, multiply, divide): ");
                operation = scanner.nextLine();

                System.out.println("Enter first number: ");
                a = scanner.nextDouble();

                System.out.println("Enter second number: ");
                b = scanner.nextDouble();

                break;
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        return new OperationData(operation, a, b);
    }
}
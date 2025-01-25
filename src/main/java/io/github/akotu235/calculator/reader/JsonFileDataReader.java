package io.github.akotu235.calculator.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.akotu235.calculator.exception.reader.FileNotExistException;
import io.github.akotu235.calculator.exception.reader.JsonReadException;
import io.github.akotu235.calculator.model.OperationData;

import java.io.File;

public class JsonFileDataReader implements DataReader {
    private final String filePath;

    public JsonFileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public OperationData readData() {
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                OperationData operationData = objectMapper.readValue(file, OperationData.class);
                System.out.println("JSON: " + operationData);
                return operationData;
            } catch (Exception e) {
                throw new JsonReadException("Error reading JSON file: " + e.getMessage());
            }
        } else {
            throw new FileNotExistException("File: " + filePath + " not exist!");
        }
    }
}
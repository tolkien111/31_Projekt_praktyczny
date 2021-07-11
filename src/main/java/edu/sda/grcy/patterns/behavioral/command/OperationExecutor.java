package edu.sda.grcy.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class OperationExecutor {

    private final List<Operation> operations = new ArrayList<>();

    public String executeOperation (Operation operation, String content) {
        operations.add(operation);
        return operation.performOperation(content);
    }

    public List<Operation> getOperations() {
        return operations;
    }
}

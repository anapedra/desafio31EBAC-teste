package org.anasantana.config;



import org.anasantana.services.Operation;
import org.anasantana.services.exceptions.InvalidOperationException;
import org.anasantana.services.impl.Addition;
import org.anasantana.services.impl.Division;
import org.anasantana.services.impl.Multiplication;
import org.anasantana.services.impl.Subtraction;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry class responsible for holding and retrieving all available operations.
 * Works without Spring (manual instantiation).
 *
 * @author Ana
 */
public class OperationRegistry {

    private final Map<String, Operation> operations = new HashMap<>();

    public OperationRegistry() {
        registerAll(); // registro manual das estratégias
    }

    private void registerAll() {
        register(new Addition());
        register(new Subtraction());
        register(new Multiplication());
        register(new Division());
    }

    private void register(Operation operation) {
        operations.put(operation.getSymbol(), operation);
    }

    public Operation getOperation(String symbol) {
        Operation op = operations.get(symbol);
        if (op == null) {
            throw new InvalidOperationException("Operation '" + symbol + "' is not supported.");
        }
        return op;
    }
}

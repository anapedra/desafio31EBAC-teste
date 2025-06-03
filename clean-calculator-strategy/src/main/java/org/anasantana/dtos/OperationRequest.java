package org.anasantana.dtos;

import java.math.BigDecimal;

/**
 * DTO representing the input of a calculation request.
 * Contains two numeric operands and the operation symbol to apply.
 *
 * Example JSON:
 * {
 *   "a": 10.0,
 *   "b": 5.0,
 *   "operation": "+"
 * }
 *
 * Supported operations: +, -, *, /
 *
 * This class is used to transfer data from the client to the calculation logic.
 * It does not contain business logic.
 * 
 * @author Ana
 */
public class OperationRequest {

    private BigDecimal a;
    private BigDecimal b;
    private String operation;

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

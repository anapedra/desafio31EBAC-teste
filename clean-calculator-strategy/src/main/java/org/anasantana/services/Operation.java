package org.anasantana.services;

import java.math.BigDecimal;

/**
 * Represents a mathematical operation that can be performed on two BigDecimal operands.
 * Implementations must ensure correct handling of null values and any arithmetic exceptions.
 *
 * Example implementations: Addition, Subtraction, Multiplication, Division.
 * 
 * @author Ana
 */
public interface Operation {

    /**
     * Executes the operation using the provided operands.
     *
     * @param a the first operand (cannot be null)
     * @param b the second operand (cannot be null)
     * @return the result of the operation as a BigDecimal
     * @throws RuntimeException if operands are invalid or operation fails
     */
    BigDecimal execute(BigDecimal a, BigDecimal b);
    String getSymbol();
}

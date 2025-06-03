package org.anasantana.services.impl;

import org.anasantana.services.Operation;
import org.anasantana.services.exceptions.NullOperandException;

import java.math.BigDecimal;

/**
 * Performs subtraction between two BigDecimal numbers.
 * Subtracts b from a (a - b).
 * 
 * @author Ana
 */
public class Subtraction implements Operation {

    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new NullOperandException("Operands cannot be null");
        }
        return a.subtract(b);
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}

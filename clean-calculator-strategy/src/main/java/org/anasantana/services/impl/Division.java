package org.anasantana.services.impl;

import org.anasantana.services.Operation;
import org.anasantana.services.exceptions.DivisionByZeroException;
import org.anasantana.services.exceptions.NullOperandException;

import java.math.BigDecimal;

/**
 * Performs division between two BigDecimal numbers.
 * Throws exception if denominator is zero or any operand is null.
 * 
 * @author Ana
 */
public class Division implements Operation {

    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new NullOperandException("Operands cannot be null");
        }

        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }

        return a.divide(b, 10, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public String getSymbol() {
        return "/";
    }
}

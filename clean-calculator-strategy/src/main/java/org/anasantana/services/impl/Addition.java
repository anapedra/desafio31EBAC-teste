package org.anasantana.services.impl;

import org.anasantana.services.Operation;
import org.anasantana.services.exceptions.NullOperandException;

import java.math.BigDecimal;

/**
 * Performs addition between two BigDecimal numbers.
 *
 * @author Ana
 */
public class Addition implements Operation {

    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new NullOperandException("Operands cannot be null");
        }
        return a.add(b);
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}

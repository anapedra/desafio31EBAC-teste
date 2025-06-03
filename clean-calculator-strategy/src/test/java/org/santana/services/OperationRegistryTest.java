package org.santana.services;

import org.anasantana.config.OperationRegistry;
import org.anasantana.services.Operation;
import org.anasantana.services.exceptions.DivisionByZeroException;
import org.anasantana.services.exceptions.InvalidOperationException;
import org.anasantana.services.exceptions.NullOperandException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the OperationRegistry and operation strategies.
 * Covers success and exception scenarios with precision.
 *
 * @author Ana
 */
public class OperationRegistryTest {

    private OperationRegistry registry;

    @BeforeEach
    void setUp() {
        registry = new OperationRegistry();
    }

    // ✅ Casos de sucesso
    @Test
    @DisplayName("CT-001 | Addition: 2.5 + 3.1 = 5.6")
    void testAddition() {
        Operation op = registry.getOperation("+");
        assertEquals(new BigDecimal("5.6"), op.execute(new BigDecimal("2.5"), new BigDecimal("3.1")));
    }

    @Test
    @DisplayName("CT-002 | Subtraction: 10 - 3 = 7")
    void testSubtraction() {
        Operation op = registry.getOperation("-");
        assertEquals(new BigDecimal("7"), op.execute(new BigDecimal("10"), new BigDecimal("3")));
    }

    @Test
    @DisplayName("CT-003 | Multiplication: 1.5 * 2 = 3.0")
    void testMultiplication() {
        Operation op = registry.getOperation("*");
        assertEquals(new BigDecimal("3.0"), op.execute(new BigDecimal("1.5"), new BigDecimal("2")));
    }

    @Test
    @DisplayName("CT-004 | Division: 1 / 3 = 0.3333333333")
    void testDivisionPrecision() {
        Operation op = registry.getOperation("/");
        assertEquals(new BigDecimal("0.3333333333"), op.execute(new BigDecimal("1"), new BigDecimal("3")));
    }

    //Exceções esperadas
    @Test
    @DisplayName("CT-005 | Division by zero throws DivisionByZeroException")
    void testDivisionByZero() {
        Operation op = registry.getOperation("/");
        assertThrows(DivisionByZeroException.class,
                () -> op.execute(new BigDecimal("10"), BigDecimal.ZERO));
    }

    @Test
    @DisplayName("CT-006 | Null operand throws NullOperandException in Addition")
    void testNullOperandInAddition() {
        Operation op = registry.getOperation("+");
        assertThrows(NullOperandException.class,
                () -> op.execute(null, new BigDecimal("1")));
    }

    @Test
    @DisplayName("CT-007 | Unknown operation throws InvalidOperationException")
    void testInvalidOperation() {
        assertThrows(InvalidOperationException.class,
                () -> registry.getOperation("%"));
    }

    // Casos de precisão e negativo
    @Test
    @DisplayName("CT-008 | Division with precision: 1 / 6 = 0.1666666667")
    void testDivisionSixths() {
        Operation op = registry.getOperation("/");
        assertEquals(new BigDecimal("0.1666666667"), op.execute(new BigDecimal("1"), new BigDecimal("6")));
    }

    @Test
    @DisplayName("CT-009 | Multiplication by zero: 123.456 * 0 = 0")
    void testMultiplicationByZero() {
        Operation op = registry.getOperation("*");
        BigDecimal expected = BigDecimal.ZERO.stripTrailingZeros();
        BigDecimal actual = op.execute(new BigDecimal("123.456"), BigDecimal.ZERO).stripTrailingZeros();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CT-010 | Negative multiplication: -2 * 3 = -6")
    void testNegativeMultiplication() {
        Operation op = registry.getOperation("*");
        assertEquals(new BigDecimal("-6"), op.execute(new BigDecimal("-2"), new BigDecimal("3")));
    }

    @Test
    @DisplayName("CT-011 | Subtraction with zero: 0 - 0 = 0")
    void testSubtractionWithZero() {
        Operation op = registry.getOperation("-");
        assertEquals(BigDecimal.ZERO, op.execute(BigDecimal.ZERO, BigDecimal.ZERO));
    }
}

package org.anasantana.services.exceptions;

/**
 * Exception thrown when attempting to divide by zero.
 * 
 * @author Ana
 */
public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

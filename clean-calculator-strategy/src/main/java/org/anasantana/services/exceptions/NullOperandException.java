package org.anasantana.services.exceptions;

/**
 * Exception thrown when an operand is null.
 * Indicates a violation of calculator input requirements.
 * 
 * @author Ana
 */
public class NullOperandException extends RuntimeException {
    public NullOperandException(String message) {
        super(message);
    }
}

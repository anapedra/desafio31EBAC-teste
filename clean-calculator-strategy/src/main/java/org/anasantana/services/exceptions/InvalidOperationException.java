package org.anasantana.services.exceptions;

/**
 * Exception thrown when an unsupported or invalid operation is requested.
 * This is useful for future integration with factories or dynamic operation selection.
 * 
 * Example: When an operation string like "square-root" is passed but not implemented.
 * 
 * @author Ana
 */
public class InvalidOperationException extends RuntimeException {

    /**
     * Constructs a new InvalidOperationException with the specified detail message.
     * 
     * @param message The detail message explaining the reason for the exception.
     */
    public InvalidOperationException(String message) {
        super(message);
    }
}

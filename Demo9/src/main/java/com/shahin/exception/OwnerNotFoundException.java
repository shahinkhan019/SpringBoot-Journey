package com.shahin.exception;

public class OwnerNotFoundException extends Exception { // Custom exception class to indicate that an owner was not found.
    private static final long serialVersionUID = 1L; // Added serialVersionUID for serialization compatibility, basically used in Java for version control of serialized data.

    public OwnerNotFoundException(String message) {
        super(message); // Call the constructor of the superclass (Exception) with the provided message.
    }
}

package com.spring.registrationsystem.exception;

public class EmailAlreadyTakenException extends RuntimeException {
    public EmailAlreadyTakenException(String message){
        super(message);
    }
}

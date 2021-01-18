package com.virtusa.exceptionhandling.stacktrace.exceptions;

public class InvalidCardNumberException extends Exception{

    public InvalidCardNumberException(String message,Exception exception){
        super(message,exception);
    }
}

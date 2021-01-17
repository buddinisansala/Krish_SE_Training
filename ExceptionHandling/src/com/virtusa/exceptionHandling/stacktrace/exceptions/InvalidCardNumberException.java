package com.virtusa.exceptionHandling.stacktrace.exceptions;

public class InvalidCardNumberException extends Exception{

    public InvalidCardNumberException(String message,Exception exception){
        super(message,exception);
    }
}

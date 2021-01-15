package com.virtusa.exceptionHandling.stackTrace;

public class InvalidCardNumberException extends Exception{

    public InvalidCardNumberException(String message,Exception exception){
        super(message,exception);
    }
}

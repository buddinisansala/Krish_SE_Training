package com.buddhi.exceptionhandling.stacktrace.exceptions;

public class InvalidRenewalException extends Exception{
    public InvalidRenewalException(String message, Exception exception){
        super(message , exception);
    }
}

package com.virtusa.exceptionHandling.stacktrace.exceptions;

public class InvalidRenewalException extends Exception{
    public InvalidRenewalException(String message, Exception exception){
        super(message , exception);
    }
}

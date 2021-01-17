package com.virtusa.exceptionHandling.stackTrace;

public class InvalidRenewalException extends Exception{
    public InvalidRenewalException(String message, Exception exception){
        super(message , exception);
    }
}

package com.virtusa.exceptionHandling.stacktrace.exceptions;

public class InvalidDateFormatException extends Exception{

    public InvalidDateFormatException(String message,Exception exception){
        super(message,exception);
    }
}

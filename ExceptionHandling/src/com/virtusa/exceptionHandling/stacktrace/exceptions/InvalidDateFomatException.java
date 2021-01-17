package com.virtusa.exceptionHandling.stacktrace.exceptions;

public class InvalidDateFomatException extends Exception{

    public InvalidDateFomatException(String message,Exception exception){
        super(message,exception);
    }
}

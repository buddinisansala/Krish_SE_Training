package com.buddhi.exceptionhandling.stacktrace.exceptions;

public class InvalidDateFormatException extends Exception{

    public InvalidDateFormatException(String message,Exception exception){
        super(message,exception);
    }
}

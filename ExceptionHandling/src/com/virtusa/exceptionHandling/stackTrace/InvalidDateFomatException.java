package com.virtusa.exceptionHandling.stackTrace;

public class InvalidDateFomatException extends Exception{

    public InvalidDateFomatException(String message,Exception exception){
        super(message,exception);
    }
}

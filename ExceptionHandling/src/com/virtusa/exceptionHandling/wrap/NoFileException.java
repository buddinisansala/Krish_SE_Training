package com.virtusa.exceptionHandling.wrap;

public class NoFileException extends RuntimeException{
    public NoFileException(String message){
        super(message);
    }
}

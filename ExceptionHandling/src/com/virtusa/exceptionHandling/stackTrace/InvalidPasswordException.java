package com.virtusa.exceptionHandling.stackTrace;

public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String message){
        super(message);
    }

}
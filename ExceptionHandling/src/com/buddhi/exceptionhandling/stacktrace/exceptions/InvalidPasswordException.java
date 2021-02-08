package com.buddhi.exceptionhandling.stacktrace.exceptions;

public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String message){
        super(message);
    }

}
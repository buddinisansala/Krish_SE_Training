package com.virtusa.exceptionhandling.checkedunchecked.exceptions;

public class DivideByZeroException extends RuntimeException{

    private static final long serialVersionUID=1L;

    public DivideByZeroException(String message){
        super(message);
    }

}

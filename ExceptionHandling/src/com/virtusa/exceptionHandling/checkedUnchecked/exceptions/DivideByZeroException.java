package com.virtusa.exceptionHandling.checkedUnchecked.exceptions;

public class DivideByZeroException extends RuntimeException{

    private static final long serialVersionUID=1L;

    public DivideByZeroException(String message){
        super(message);
    }

}

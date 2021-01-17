package com.virtusa.exceptionHandling.checkedUnchecked.exceptions;

public class PrinterNotFoundException extends Exception{

    private static final long serialVersionUID=1L;

    public PrinterNotFoundException(String message){
        super(message);
    }

}

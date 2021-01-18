package com.virtusa.exceptionhandling.wrapped;

public class FileNotFoundException extends RuntimeException{
    private static final long serialVersionUID=1L;

    public FileNotFoundException(String message,Exception exception){
        super(message,exception);
    }
}

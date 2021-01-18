package com.virtusa.exceptionHandling.stacktrace.libraryManagement;

import com.virtusa.exceptionHandling.stacktrace.exceptions.InvalidRenewalException;

public class Application {

    public static void main(String[] args) {
        try{
            Book book = new Book();
            book.newBook();

        } catch(InvalidRenewalException exception){
            exception.printStackTrace();        }
    }


}

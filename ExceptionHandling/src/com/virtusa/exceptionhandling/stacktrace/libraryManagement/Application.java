package com.virtusa.exceptionhandling.stacktrace.libraryManagement;

import com.virtusa.exceptionhandling.stacktrace.exceptions.InvalidRenewalException;

public class Application {

    public static void main(String[] args) {
        try{
            Book book = new Book();
            book.renewBook();

        } catch(InvalidRenewalException exception){
            exception.printStackTrace();        }
    }


}

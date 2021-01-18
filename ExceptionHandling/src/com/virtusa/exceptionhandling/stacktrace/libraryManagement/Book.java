package com.virtusa.exceptionhandling.stacktrace.libraryManagement;


import com.virtusa.exceptionhandling.stacktrace.exceptions.InvalidRenewalException;
import com.virtusa.exceptionhandling.stacktrace.exceptions.InvalidCardNumberException;


public class Book {
    public void newBook() throws InvalidRenewalException{
        try {
            Fines fines = new Fines();
            fines.payFines();
        }catch(InvalidCardNumberException exception) {
            throw new InvalidRenewalException("Renew Detail is Incorrect",exception);
        }

    }

}

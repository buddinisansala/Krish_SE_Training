package com.buddhi.exceptionhandling.stacktrace.libraryManagement;


import com.buddhi.exceptionhandling.stacktrace.exceptions.InvalidRenewalException;
import com.buddhi.exceptionhandling.stacktrace.exceptions.InvalidCardNumberException;


public class Book {
    public void renewBook() throws InvalidRenewalException{
        try {
            Fines fines = new Fines();
            fines.payFines();
        }catch(InvalidCardNumberException exception) {
            throw new InvalidRenewalException("Renew Detail is Incorrect",exception);
        }

    }

}

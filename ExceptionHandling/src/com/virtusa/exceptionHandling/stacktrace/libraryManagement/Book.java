package com.virtusa.exceptionHandling.stacktrace.libraryManagement;


import com.virtusa.exceptionHandling.stacktrace.exceptions.*;

public class Book {
    public void newBook() throws Exception{
        try {
            Fines fines = new Fines();
            fines.payFines();
        }catch(InvalidCardNumberException exception) {
            throw new InvalidRenewalException("Enter a valid renew Detail",exception);
        }

    }

}

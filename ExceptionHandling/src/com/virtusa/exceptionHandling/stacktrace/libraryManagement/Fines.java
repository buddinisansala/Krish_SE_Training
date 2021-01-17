package com.virtusa.exceptionHandling.stacktrace.libraryManagement;

import com.virtusa.exceptionHandling.stacktrace.exceptions.*;
public class Fines {
    public static void payFines() throws Exception {
        try {
            calculateFine();
        }catch (InvalidDateFomatException exception) {
            throw new InvalidCardNumberException("Enter a correct card number ",exception);
        }
    }

    public static void calculateFine() throws Exception {
        try {
            Authenticates authenticates = new Authenticates();
            authenticates.authentication();
        } catch (InvalidPasswordException exception){
            throw new InvalidDateFomatException("Enter a correct format of date ",exception);
        }
    }
}

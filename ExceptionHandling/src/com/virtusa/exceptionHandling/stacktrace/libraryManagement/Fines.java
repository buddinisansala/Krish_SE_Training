package com.virtusa.exceptionHandling.stacktrace.libraryManagement;

import com.virtusa.exceptionHandling.stacktrace.exceptions.*;


public class Fines {
    public static void payFines() throws InvalidCardNumberException {
        try {
            calculateFine();
        }catch (InvalidDateFormatException exception) {
            throw new InvalidCardNumberException("Card Number is Incorrect",exception);
        }
    }

    public static void calculateFine() throws InvalidDateFormatException {
        try {
            Authenticates authenticates = new Authenticates();
            authenticates.authentication();
        } catch (InvalidPasswordException exception){
            throw new InvalidDateFormatException("Date Format is Invalid",exception);
        }
    }
}

package com.buddhi.exceptionhandling.stacktrace.libraryManagement;

import com.buddhi.exceptionhandling.stacktrace.exceptions.*;


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

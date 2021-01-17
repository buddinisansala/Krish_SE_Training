package com.virtusa.exceptionHandling.stackTrace;

public class LibraryManagement {
    public static void main(String []args) {
        try{
            renewBook();
        } catch(InvalidRenewalException exception){
            exception.printStackTrace();
        }
    }

    public static void renewBook() throws InvalidRenewalException{
        try {
            payFine();
        }catch(InvalidCardNumberException exception) {
            throw new InvalidRenewalException("Enter a valid renew Detail",exception);
        }
    }

    public static void payFine() throws InvalidCardNumberException {
        try {
            calculateFine();
        } catch (InvalidDateFomatException exception) {
            throw new InvalidCardNumberException("Enter a correct card number ",exception);
        }
    }

    public static void calculateFine() throws InvalidDateFomatException {
        try {
            authentication();
        } catch (InvalidPasswordException exception){
            throw new InvalidDateFomatException("Enter a correct format of date ",exception);
        }
    }

    public static void authentication() throws InvalidPasswordException{
        throw new InvalidPasswordException("Enter a correct Password");
    }
}

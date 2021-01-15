package com.virtusa.exceptionHandling.stackTrace;

public class LibraryManagement {
    public static void main(String []args) {
        try{
            authentication();
        } catch(InvalidPasswordException exception){
            exception.printStackTrace();
        }
    }

    public static void authentication() throws InvalidPasswordException{
        try {
            calculateFine();
        }catch(InvalidDateFomatException exception) {
            throw new InvalidPasswordException("Enter a valid password",exception);
        }
    }

    public static void calculateFine() throws InvalidDateFomatException {
        try {
            payFine();
        } catch (InvalidCardNumberException exception) {
            throw new InvalidDateFomatException("Enter a correct format of date ",exception);
        }
    }

    public static void payFine() throws InvalidCardNumberException {
        try {
            renewBook();
        } catch (InvalidRenewalException exception){
            throw new InvalidCardNumberException("Enter a correct card number",exception);
        }
    }

    public static void renewBook() throws InvalidRenewalException{
        throw new InvalidRenewalException("Enter a correct Renew Detail");
    }

}

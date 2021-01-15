package com.virtusa.exceptionHandling.exception;

class InvalidUsernameException extends Exception {

    InvalidUsernameException(String username) {
        super(username);
    }
}

public class CheckedException {

    static void InvalidUsername(String username) throws InvalidUsernameException {
        if (username.length() > 2) {
            System.out.println("Username successfully added");
        } else {
            throw new InvalidUsernameException("Not valid Username");
        }
    }

    public static void main(String[] args) {
        try {
            InvalidUsername("la");
        } catch (InvalidUsernameException exeption) {
            exeption.printStackTrace();
        }
    }
}
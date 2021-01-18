package com.virtusa.exceptionhandling.stacktrace.libraryManagement;

import com.virtusa.exceptionhandling.stacktrace.exceptions.InvalidPasswordException;

public class Authenticates {
    public static void authentication() throws InvalidPasswordException {
        throw new InvalidPasswordException("Password is Invalid");
    }
}

package com.buddhi.exceptionhandling.stacktrace.libraryManagement;

import com.buddhi.exceptionhandling.stacktrace.exceptions.InvalidPasswordException;

public class Authenticates {
    public static void authentication() throws InvalidPasswordException {
        throw new InvalidPasswordException("Password is Invalid");
    }
}

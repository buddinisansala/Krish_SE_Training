package com.virtusa.exceptionHandling.stacktrace.libraryManagement;

import com.virtusa.exceptionHandling.stacktrace.exceptions.InvalidPasswordException;

public class Authenticates {
    public static void authentication() throws Exception {
        throw new InvalidPasswordException("Password is Invalid");
    }
}

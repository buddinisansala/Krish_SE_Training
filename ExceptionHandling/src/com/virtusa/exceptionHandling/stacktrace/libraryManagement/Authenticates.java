package com.virtusa.exceptionHandling.stacktrace.libraryManagement;

import com.virtusa.exceptionHandling.stacktrace.exceptions.*;

public class Authenticates {
    public static void authentication() throws Exception {
        throw new InvalidPasswordException("Enter a correct Password");
    }
}

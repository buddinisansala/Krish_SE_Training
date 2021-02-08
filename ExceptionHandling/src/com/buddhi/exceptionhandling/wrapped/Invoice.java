package com.buddhi.exceptionhandling.wrapped;

import java.io.IOException;

public class Invoice {

    public static void getInvoice() throws FileNotFoundException{
        try {
            printInvoice();
        } catch ( IOException exception ) {
            throw new FileNotFoundException("Invoice Can Not Found",exception);
        }
    }

    public static void printInvoice() throws IOException{
        throw new IOException();
    }
}

package com.virtusa.exceptionHandling.wrapped;

import java.io.IOException;

public class Invoice {

    public static void main(String[] args) {
        try {
            getInvoice();
        }catch ( FileNotFoundException exception ){
            System.err.println("Invoice Can Not Found In The Directory");
        }
    }

    public static void getInvoice() throws FileNotFoundException{
        try {
            printFile();
        } catch ( IOException exception ) {
            throw new FileNotFoundException("Invoice Can Not Found",exception);
        }
    }

    public static void printFile() throws IOException{
        throw new IOException();
    }
}

package com.virtusa.exceptionHandling.wrapped;

import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try {
            getFile();
        }catch ( FileNotFoundException exception ){
            System.err.println("File Can Not Found In The Directory");
        }
    }

    public static void getFile() throws FileNotFoundException{
        try {
            printFile();
        } catch ( IOException exception ) {
            throw new FileNotFoundException("File Can Not Found",exception);
        }
    }

    public static void printFile() throws IOException{
        throw new IOException();
    }
}

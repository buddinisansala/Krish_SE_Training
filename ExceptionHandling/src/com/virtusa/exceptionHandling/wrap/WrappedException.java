package com.virtusa.exceptionHandling.wrap;
import java.io.*;

public class WrappedException {
    public void readFile(){
        String string;
        try {
            FileReader fileReader=new FileReader("/home/buddhi/Documents/text.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            string = bufferedReader.readLine();
            System.out.println(string);
        } catch (FileNotFoundException e) {
            throw new NoFileException("File not found or invalid directory");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

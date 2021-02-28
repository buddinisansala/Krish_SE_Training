package com.buddhi.inclassassignment.Assignment1;

import com.buddhi.inclassassignment.Exception.NullStringException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();

        System.out.println("your word is: "+ word);
        try {
            Calculation calculation=new Calculation();
            calculation.calculateTotal(word);
        }catch ( NullStringException exception ){
            System.out.println("String cannot be null");
        }



    }
}

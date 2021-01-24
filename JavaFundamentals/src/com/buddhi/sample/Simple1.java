package com.buddhi.sample;

public class Simple1 {
    public static void main(String args[]){
        int a = 5;
        int b = a;
        float c = a;

        float f = 10.5f;
        //int d = f; compile time error
        int d = (int)f;

        System.out.println(a); //5
        System.out.println(b); // 5
        System.out.println(c); // 5.0

        System.out.println(f); // 10.5
        System.out.println(d); // 10 (remove the decimal point)
    }
}

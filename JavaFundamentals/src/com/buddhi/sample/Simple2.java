package com.buddhi.sample;

public class Simple2 {
    public static void main(String args[]) {
        int a = 130;
        byte b = (byte) a;
        byte c = 124;
        int d= c; //124

        byte x = 10;
        byte y = 10;
        //byte z = x+y; CE : x+y = 20 will be int
        byte z = (byte) (x+y);
        System.out.println(a); // 130
        System.out.println(b);// -126 circularly added

        System.out.println(z);
    }
}
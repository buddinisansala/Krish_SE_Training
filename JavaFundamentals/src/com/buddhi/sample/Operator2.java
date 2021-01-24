package com.buddhi.sample;

public class Operator2 {
    public static void main(String args[]) {
        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a); //-11
        System.out.println(~b); //9
        System.out.println(!c); //false
        System.out.println(!d); //true

        System.out.println(10*10/5+3-1*4/2);//21
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

    }
}
package com.buddhi.sample;

public class Operator1 {
    public static void main(String args[]){
        int x = 10;
        System.out.println(x++);//10 (print 10 and increment by 1 - 11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (print 12 and decrement by 1 - 11)
        System.out.println(--x);//10

        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a); //10+ 12(22)
        System.out.println(b++ + b++); //10+11(21)
    }
}

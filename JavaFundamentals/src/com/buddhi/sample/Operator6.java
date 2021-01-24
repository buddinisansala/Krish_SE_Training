package com.buddhi.sample;

public class Operator6 {
    public static void main(String args[]){
        int a=2;
        int b=5;
        int c=7;
        c+=1;// c= c+1;
        int min=(a<b)?a:b;
        int max= (a>b)?a:b;

        System.out.println(min);//2
        System.out.println(max);//5
        System.out.println(c);//8

    }
}

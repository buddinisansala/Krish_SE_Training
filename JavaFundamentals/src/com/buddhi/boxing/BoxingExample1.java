package com.buddhi.boxing;

public class BoxingExample1 {
    public static void main(String args[]){
        int a=50;
        Integer a2=new Integer(a);//Boxing
        //Integer a2=a;
        Integer a3=5;//Boxing

        System.out.println(a2+" "+a3);
    }
}

package com.buddhi.sample;

public class Variable {
    int data = 50;// instance variable
    static int m = 100;// static variable
    public static void main(String args[]) {
        Variable variable = new Variable();
        variable.print();
    }

    void print(){
        if(data==50){
            int n = 5;// local variable
            m = 60;
            System.out.println(m);//60
        }
    }
}
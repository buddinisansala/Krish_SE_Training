package com.buddhi.controlstatement;

public class NestedIfExample {
    public static void main(String args[]){
        int age = 10;
        int weight = 48;
        if(age > 18){
            if(weight > 50){
                System.out.println("You can donate blood");
            }else {
                System.out.println("Low weight");
            }
        }
        else{
            System.out.println("You have to wait "+(18-age)+" years");
        }
    }
}

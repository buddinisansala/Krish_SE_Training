package com.buddhi.designpattern.builderpattern;

public class Application {

    public static void main(String args[]){

        BankAccount.Builder builder = new BankAccount.Builder(1234567);
        BankAccount bankAccount = builder.branch("Galle").ownerName("Buddhi").balance(1000.00).interestRate(3.5).build();
        System.out.println(bankAccount);

        BankAccount.Builder builder1 = new BankAccount.Builder(7654321);
        BankAccount bankAccount1 = builder.branch("Colombo").ownerName("Kasun").balance(100000.00).interestRate(2.75).build();
        System.out.println(bankAccount1);

    }
}

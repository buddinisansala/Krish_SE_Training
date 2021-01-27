package com.buddhi.designpattern.singleton;

public class Application {

    public static void main(String[] args) {
        long start;
        long end;
        
        Transactions.getTransactions().add(new Transaction(50000,"David ","Sheran"));
        Transactions.getTransactions().add(new Transaction(65000,"Hadhi","akitha"));
        Transactions.getTransactions().add(new Transaction(10000,"Abhishek","Rakhitha"));

        Transactions.getTransactions().print();

    }
}

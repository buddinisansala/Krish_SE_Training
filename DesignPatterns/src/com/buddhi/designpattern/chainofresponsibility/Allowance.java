package com.buddhi.designpattern.chainofresponsibility;

public class Allowance extends Handler{

    @Override
    public double applySalary(PaySheet paySheet) {
        paySheet.setSalary(paySheet.getSalary()+paySheet.getSalary()*0.25);
        System.out.println("Allowance applied");
        return paySheet.getSalary();
    }
}

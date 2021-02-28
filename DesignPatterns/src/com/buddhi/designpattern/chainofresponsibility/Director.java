package com.buddhi.designpattern.chainofresponsibility;

public class Director extends Handler{

    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getTier()==2){
            paySheet.setSalary(175000.00);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }
}

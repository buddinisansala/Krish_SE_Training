package com.buddhi.designpattern.chainofresponsibility;

public class Manager extends Handler{

    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getTier()==3){
            paySheet.setSalary(100000.00);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }
}

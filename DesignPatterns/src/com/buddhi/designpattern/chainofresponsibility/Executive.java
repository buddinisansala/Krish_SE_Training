package com.buddhi.designpattern.chainofresponsibility;

public class Executive extends Handler{

    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getTier()==4){
            paySheet.setSalary(50000.00);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }
}

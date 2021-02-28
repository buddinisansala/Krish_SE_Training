package com.buddhi.designpattern.chainofresponsibility;

public class CEO extends Handler{

    @Override
    public double applySalary(PaySheet paySheet) {
        if(paySheet.getTier()==1){
            paySheet.setSalary(350000.00);
            return paySheet.getSalary();
        }else {
            return successor.applySalary(paySheet);
        }
    }

}

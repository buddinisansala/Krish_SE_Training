package com.buddhi.designpattern.chainofresponsibility;

public class Salary extends Handler{

    @Override
    public double applySalary(PaySheet paySheet) {
        return successor.applySalary(paySheet);
    }
}

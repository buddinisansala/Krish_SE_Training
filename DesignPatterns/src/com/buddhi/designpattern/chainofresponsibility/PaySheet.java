package com.buddhi.designpattern.chainofresponsibility;

public class PaySheet {

    private int empNumber;
    private int tier;
    private double salary;

    protected void setSalary(double salary){
        this.salary = salary;
    }

    public PaySheet(int empNumber, int tier){
        this.empNumber = empNumber;
        this.tier = tier;

    }

    public int getEmpNumber() {
        return empNumber;
    }

    public int getTier() {
        return tier;
    }

    public double getSalary() {
        return salary;
    }
}

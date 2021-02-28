package com.buddhi.designpattern.chainofresponsibility;

public class Application {

    public static void main(String[] args) {
        CEO ceo = new CEO();
        Director director = new Director();
        Manager manager = new Manager();
        Executive executive = new Executive();
        Salary salary=new Salary();

        salary.setSuccessor(ceo);
        ceo.setSuccessor(director);
        director.setSuccessor(manager);
        manager.setSuccessor(executive);

        PaySheet paySheet=new PaySheet(10001,1);
        System.out.println(paySheet.getTier()+" "+salary.applySalary(paySheet));

        PaySheet paySheet1=new PaySheet(10234,2);
        System.out.println(paySheet1.getTier()+" "+salary.applySalary(paySheet1));

        PaySheet paySheet2=new PaySheet(10673,3);
        System.out.println(paySheet2.getTier()+" "+salary.applySalary(paySheet2));

        PaySheet paySheet3=new PaySheet(11573,4);
        System.out.println(paySheet3.getTier()+" "+salary.applySalary(paySheet3));

    }
}

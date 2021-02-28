package com.buddhi.designpattern.prototype;

public class Application {
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();

        ITStudent itStudent1 = (ITStudent) studentRegistry.getStudent(StudentType.IT);
        System.out.println(itStudent1);
        itStudent1.setLabHours(5);
        System.out.println(itStudent1);


        ITStudent itStudent2 = (ITStudent) studentRegistry.getStudent(StudentType.IT);
        System.out.println(itStudent2);

        DancingStudent dancingStudent1 = (DancingStudent) studentRegistry.getStudent(StudentType.DANCING);
        System.out.println(dancingStudent1);
        dancingStudent1.setPracticeHours(3);
        System.out.println(dancingStudent1);
    }
}

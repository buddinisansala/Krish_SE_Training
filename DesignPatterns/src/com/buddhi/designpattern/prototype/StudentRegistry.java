package com.buddhi.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<StudentType, Student> studentMap;

    public StudentRegistry() {
        studentMap = new HashMap<>();
        initialize();
    }

    public Student getStudent(StudentType studentType) {
        try {
            return (Student) studentMap.get(studentType).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void initialize() {
        ITStudent itStudent = new ITStudent();
        itStudent.setName("Sakuni Thathsarani");
        itStudent.setSchoolHours(6);
        itStudent.setLabHours(2);

        DancingStudent dancingStudent = new DancingStudent();
        dancingStudent.setName("Kasuni Sathsarani");
        dancingStudent.setSchoolHours(6);
        dancingStudent.setPracticeHours(2);


        studentMap.put(StudentType.IT, itStudent);
        studentMap.put(StudentType.DANCING, dancingStudent);
    }
}

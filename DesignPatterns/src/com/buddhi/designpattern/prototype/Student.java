package com.buddhi.designpattern.prototype;

public abstract class Student implements Cloneable {

    private String name;
    private int schoolHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolHours() {
        return schoolHours;
    }

    public void setSchoolHours(int schoolHours) {
        this.schoolHours = schoolHours;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "name=" + name + ", schoolHours=" + schoolHours;
    }
}

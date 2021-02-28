package com.buddhi.designpattern.prototype;

public class DancingStudent extends Student {

    private int practiceHours;

    public int getPracticeHours() {
        return practiceHours;
    }

    public void setPracticeHours(int practiceHours) {
        this.practiceHours = practiceHours;
    }


    @Override
    public String toString() {
        return "DancingStudent{" + super.toString() + ", practiceHours=" + practiceHours + '}';
    }
}
package com.buddhi.designpattern.prototype;

public class ITStudent extends Student {

    private int labHours;

    public int getLabHours() {
        return labHours;
    }

    public void setLabHours(int labHours) {
        this.labHours = labHours;
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "labHours=" + labHours +
                '}';
    }
}

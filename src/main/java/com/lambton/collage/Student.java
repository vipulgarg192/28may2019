package com.lambton.collage;

public class Student extends Person {

    private String courseName;
    private float totalMarks;
    private float percentage;
    private String results;
    private float []marks;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getResults() {
        return results;
    }

    public float[] getMarks() {
        return marks;
    }
    public void setMarks(float[] marks) {
        this.marks = marks;
    }

}

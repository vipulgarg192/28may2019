package com.lambton.collage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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


    public void calculateTotal() {
        this.totalMarks = 0;
        System.out.println(marks[0]);
        for(int i=0; i<this.marks.length; i++)
        {
            this.totalMarks =this.totalMarks +marks[i];
        }
    }
    public void calculatePercentage() {
        this.percentage = 0;
        percentage = this.totalMarks / this.marks.length;
    }

    public void calculateresult() {
        int passedSubj = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50.0f) {
                passedSubj++;
            }
        }
        if (passedSubj <= 2) {
            this.results = "Fail";
        } else {
            if (this.percentage >= 94) {
                this.results = "A+";
            } else if (this.percentage > 87) {
                this.results = "A";
            } else if (this.percentage > 80) {
                this.results = "A-";
            } else if (this.percentage > 77) {
                this.results = "B+";
            } else if (this.percentage > 73) {
                this.results = "B";
            } else if (this.percentage > 70) {
                this.results = "B-";
            } else if (this.percentage > 67) {
                this.results = "C+";
            } else if (this.percentage > 63) {
                this.results = "c";
            } else if (this.percentage > 60) {
                this.results = "c-";
            } else if (this.percentage > 50) {
                this.results = "D";
            } else {
                this.results = "F";
            }
        }
    }

    @Override
    public void display() {

        System.out.println(".....Student Information.....");
        System.out.println();
        System.out.println("UserId: "+getPersonId());
        System.out.println("FirstName: "+getFirstName());
        System.out.println("LastName: "+getLastName());
        System.out.println("FullName: "+getFullName());

        System.out.println("Email: "+getEmail());

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                    Locale.ENGLISH);
            Date parsedDate = sdf.parse(String.valueOf(getDateOfBirth()));
            SimpleDateFormat print = new SimpleDateFormat("MMM d, yyyy");
            System.out.println("DateOfBirth: "+print.format(parsedDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Gender: "+getGender());
        System.out.println("CourseName: "+getCourseName());
        getMarks();
        System.out.println("TotalMarks: "+getTotalMarks());
        getPercentage();
        System.out.println("TotalPercentage: "+percentage);


    }
}

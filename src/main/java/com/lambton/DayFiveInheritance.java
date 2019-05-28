package com.lambton;

import com.lambton.collage.Student;
import com.lambton.collage.Teacher;
import com.lambton.hardware.Computer;
import com.lambton.hardware.Laptop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DayFiveInheritance {

    public static void main(String[] args) throws ParseException {

        float []marks = new float[]{79.8f,66.9f,99.9f,80.5f,75.5f};

        Student student = new Student();
        Teacher teacher = new Teacher();

        Computer computer = new Computer();

        student.setPersonId(1001);
        student.setFirstName("Vipul");
        student.setLastName("Garg");
        student.setGender("Male");
        student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("06/09/1992"));
        student.setEmail("Vipul@gmail.com");
        student.setCourseName("MobileApplications");
        student.setMarks(marks);



        Laptop laptop = new Laptop();
        laptop.setId(1234);
        laptop.setManufactureName("HP");
        laptop.setScreenSize("15.5");
        laptop.setWeight(4);

        student.setComputer(laptop);

        teacher.setPersonId(1002);
        teacher.setFirstName("Pritesh");
        teacher.setLastName("Patel");
        teacher.setGender("Male");
        student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("31/3/1980"));
        teacher.setEmail("Patel@gmail.com");git
        teacher.setDepartmentName("MobileApplication");
        teacher.setDesignation("Professor");
        teacher.setSalary("$100_000");

    }
}

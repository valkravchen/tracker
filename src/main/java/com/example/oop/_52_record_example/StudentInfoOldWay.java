package com.example.oop._52_record_example;

public class StudentInfoOldWay {
    private final String studentName;
    private final int studentAge;
    private final String studentGroup;

    public StudentInfoOldWay(String studentName, int studentAge, String studentGroup) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGroup = studentGroup;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentGroup() {
        return studentGroup;
    }
}

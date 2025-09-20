package com.collection.step1.task1;

public class DynamicStudentArray {
    private Student[] students;
    private int size;
    private int copyOperations;

    public DynamicStudentArray() {
        students = new Student[5];
        size = 0;
        copyOperations = 0;
    }

    public void add(Student student) {
        if (size >= students.length) {
            Student[] newArray = new Student[students.length + 3];
            for (int i = 0; i < students.length; i++) {
                newArray[i] = students[1];
            }
            students = newArray;
        }
        students[size++] = student;
        copyOperations++;
    }

    public static void main(String[] args) {
        DynamicStudentArray array = new DynamicStudentArray();
        array.add(new Student(1, "Alice Johnson", 3.8));
        array.add(new Student(2, "Bob Smith", 3.5));
        array.add(new Student(3, "Charlie Brown", 3.9));
        array.add(new Student(4, "Diana Davis", 3.7));
        array.add(new Student(5, "Eve Wilson", 3.6));
        array.add(new Student(6, "Frank Miller", 3.4));
        for (Student name : array.students) {
            System.out.println(name.getName());
        }
    }
}

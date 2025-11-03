package ru.map;

import java.util.*;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Student findByAccount(String account) {
        for (Student student : students.keySet()) {
            if (student.account().equals(account)) {
                return student;
            }
        }
        return null;
    }

    public Subject findBySubjectName(String account, String name) {
        Student student = findByAccount(account);
        if (student != null) {
            Set<Subject> subjects = students.get(student);
            for (Subject subject : subjects) {
                if (subject.name().equals(name)) {
                    return subject;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001",
                        "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.score());
    }
}

package ru.stream.example;

import java.util.List;

public class Pupil {
    private String name;
    private List<Subject> subjects;

    public Pupil(String name, Subject... subjects) {
        this.name = name;
        this.subjects = List.of(subjects);
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public static void main(String[] args) {
        List<Pupil> pupils = List.of(
                new Pupil("Иван",
                        new Subject("Математика", 85),
                        new Subject("Физика", 90)),
                new Pupil("Мария",
                        new Subject("Математика", 95),
                        new Subject("Физика", 88))
        );

        System.out.println("ИСХОДНЫЕ ДАННЫЕ:");
        pupils.forEach(pupil -> {
            System.out.println(pupil.getName() + ":");
            pupil.getSubjects().forEach(subject ->
                    System.out.println(" " + subject.getName() + ": " + subject.getScore()));
        });
    }
}

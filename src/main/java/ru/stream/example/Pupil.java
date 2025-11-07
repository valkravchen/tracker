package ru.stream.example;

import java.util.Collection;
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

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
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

        System.out.println("\nПОШАГОВО:");
        List<List<Subject>> allSubjectsLists = pupils
                .stream()
                .map(Pupil::getSubjects)
                .toList();
        System.out.println("1. Списки предметов: " + allSubjectsLists.size() + " списка");

        List<Subject> allSubjects = pupils
                .stream()
                .map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .toList();
        System.out.println("2. Все предметы: " + allSubjects.size() + " шт");

        List<Integer> allScores = pupils
                .stream()
                .map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .map(Subject::getScore)
                .toList();
        System.out.println("3. Все баллы: " + allScores);

        double average = pupils
                .stream()
                .map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0.0);
        System.out.println("\nРЕЗУЛЬТАТ: " + average);
    }
}

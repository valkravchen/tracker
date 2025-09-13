package ru.hashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return (double) sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sum = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
            Label label = new Label(pupil.name(), (double) sum / count);
            labels.add(label);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return List.of();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }

    public static void main(String[] args) {
        List<Pupil> pupils = List.of(
                new Pupil("Ivanov",
                        List.of(
                                new Subject("Math", 70),
                                new Subject("Lang", 90),
                                new Subject("Philosophy", 100)
                        )
                ),
                new Pupil("Petrov",
                        List.of(
                                new Subject("Lang", 60),
                                new Subject("Math", 60),
                                new Subject("Philosophy", 60)
                        )
                ),
                new Pupil("Semenov",
                        List.of(
                                new Subject("Philosophy", 50),
                                new Subject("Lan", 60),
                                new Subject("Math", 80)
                        )
                )
        );
        Map<String, Integer> subjectScores = new LinkedHashMap<>();
        Map<String, Integer> subjectCounts = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                subjectScores.put(name, subjectScores.getOrDefault(name, 0) + subject.score());
                subjectCounts.put(name, subjectCounts.getOrDefault(name, 0) + 1);
            }
        }
        List<Label> result = new ArrayList<>();

        for (String subjectName : subjectScores.keySet()) {
            int totalScore = subjectScores.get(subjectName);
            int count = subjectCounts.get(subjectName);
            double average = (double) totalScore / count;
            result.add(new Label(subjectName, average));
        }
        System.out.println(result);
    }
}


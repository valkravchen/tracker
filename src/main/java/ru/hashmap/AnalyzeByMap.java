package ru.hashmap;

import java.util.*;

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
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            int count = pupil.subjects().size();
            Label label = new Label(pupil.name(), (double) sum / count);
            labels.add(label);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
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
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            Label label = new Label(pupil.name(), sum);
            labels.add(label);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                subjectScores.put(name, subjectScores.getOrDefault(name, 0) + subject.score());
            }
        }
        List<Label> result = new ArrayList<>();
        for (String subjectName : subjectScores.keySet()) {
            int totalScore = subjectScores.get(subjectName);
            result.add(new Label(subjectName, totalScore));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}


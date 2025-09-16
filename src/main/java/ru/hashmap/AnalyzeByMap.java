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
        Map<String, int[]> subjectData = calculateSubjectData(pupils);
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, int[]> entry : subjectData.entrySet()) {
            String subjectName = entry.getKey();
            int[] data = entry.getValue();
            int totalScore = data[0];
            int count = data[1];
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
        Map<String, int[]> subjectData = calculateSubjectData(pupils);
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, int[]> entry : subjectData.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue()[0];
            result.add(new Label(subjectName, totalScore));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    private static Map<String, int[]> calculateSubjectData(List<Pupil> pupils) {
        Map<String, int[]> subjectData = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                int[] data = subjectData.getOrDefault(name, new int[2]);
                data[0] += subject.score();
                data[1] += 1;
                subjectData.put(name, data);
            }
        }
        return subjectData;
    }
}
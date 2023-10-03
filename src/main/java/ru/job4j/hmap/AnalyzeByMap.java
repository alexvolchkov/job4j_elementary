package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        double score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        if (count != 0) {
            score = sum / count;
        }
        return score;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            int count = 0;
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
            if (count != 0) {
                score = sum / count;
            }
            result.add(new Label(pupil.name(), score));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (map.containsKey(subject.name())) {
                    map.get(subject.name()).add(subject.score());
                } else {
                    map.put(subject.name(), new ArrayList<>(List.of(subject.score())));
                }
            }
        }
        for (String name : map.keySet()) {
            List<Integer> list = map.get(name);
            Integer sum = 0;
            for (Integer score : list) {
                sum += score;
            }
            result.add(new Label(name, (double) sum / list.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            result.add(new Label(pupil.name(), sum));
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (String name : map.keySet()) {
            result.add(new Label(name, map.get(name)));
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }
}

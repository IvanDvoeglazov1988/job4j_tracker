package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0;
        int a = 0;
        Map<Integer, Integer> one = new LinkedHashMap<>();
        for (int i = 0; i < pupils.size(); i++) {
            for (Subject num : pupils.get(i).subjects()) {
                one.put(a++, num.score());
            }
        }
        for (Integer key : one.keySet()) {
            rsl = rsl + one.get(key);
        }
        return rsl / one.size();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        int rsl = 0;
        Map<String, List<Subject>> one = new LinkedHashMap<>();
        List<Label> ret = new ArrayList<>();
        for (int i = 0; i < pupils.size(); i++) {
            one.put(pupils.get(i).name(), pupils.get(i).subjects());
        }
        Map<String, Integer> first = new LinkedHashMap<>();
        for (String a : one.keySet()) {
            List<Subject> num = one.get(a);
            for (int j = 0; j < num.size(); j++) {
                rsl = rsl + num.get(j).score();
            }
            first.put(a, rsl);
            Label label = new Label(a, rsl / one.keySet().size());
            ret.add(label);
            rsl = 0;
        }
        return ret;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        int rsl = 0;
        Map<String, List<Subject>> one = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        List<Integer> rst = new ArrayList<>();
        return List.of();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}
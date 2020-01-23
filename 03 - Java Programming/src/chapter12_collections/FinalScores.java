package chapter12_collections;

import java.util.HashMap;
import java.util.Map;

public class FinalScores {

    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        Map<String, Integer> finalScores = new HashMap<>();

        for (var originalGrade : originalGrades.entrySet()) {
            for (var makeUpGrade : makeUpGrades.entrySet()) {

                if (originalGrade.getKey().equals(makeUpGrade.getKey())) {
                    if (originalGrade.getValue() > makeUpGrade.getValue()) {
                        finalScores.put(originalGrade.getKey(), originalGrade.getValue());
                    } else {
                        finalScores.put(originalGrade.getKey(), makeUpGrade.getValue());
                    }
                }
            }
        }
        System.out.println("=== Final Grades ===");
        finalScores.forEach((k, v) -> System.out.println("Name: " + k + ", Grade: " + v));
    }
}
package usinghashmap;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static void main(String[] args) {
        String a = "abdeffg";
        String b = "abcdefgg";
        System.out.println(makeAnagram(a, b));
    }

    public static int makeAnagram(String a, String b) {
        String[] array1 = a.split("");
        HashMap<String, Integer> letterCountA = new HashMap<>();
        for (String letter : array1) {
            int count = letterCountA.getOrDefault(letter, 0);
            letterCountA.put(letter, count + 1);
        }

        String[] array2 = b.split("");
        HashMap<String, Integer> letterCountB = new HashMap<>();
        for (String letter : array2) {
            int count = letterCountB.getOrDefault(letter, 0);
            letterCountB.put(letter, count + 1);
        }

        int toalNumberOfDeletions = onlyOneContainsGivenCharacter(letterCountA, letterCountB);

        for (Map.Entry<String, Integer> entryA : letterCountA.entrySet()) {
            for (Map.Entry<String, Integer> entryB : letterCountB.entrySet()) {
                if (entryA.getKey().equals(entryB.getKey())) {
                    Integer valueA = entryA.getValue();
                    Integer valueB = entryB.getValue();
                    if (valueA > valueB) {
                        toalNumberOfDeletions += valueA - valueB;
                    } else if (valueB > valueA) {
                        toalNumberOfDeletions += valueB - valueA;
                    }

                }
            }
        }
        return toalNumberOfDeletions;
    }

    public static int onlyOneContainsGivenCharacter(HashMap<String, Integer> letterCountA, HashMap<String, Integer> letterCountB) {
        int numberOfDeletions = 0;

        for (Map.Entry<String, Integer> entryA : letterCountA.entrySet()) {
            if (!letterCountB.containsKey(entryA.getKey())) {
                numberOfDeletions += entryA.getValue();
            }
        }
        for (Map.Entry<String, Integer> entryB : letterCountB.entrySet()) {
            if (!letterCountA.containsKey(entryB.getKey())) {
                numberOfDeletions += entryB.getValue();
            }
        }

        return numberOfDeletions;
    }
}

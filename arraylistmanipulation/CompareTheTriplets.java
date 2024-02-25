package arraylistmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(4, 99, 77));
        List<Integer> b = new ArrayList<>(Arrays.asList(20, 99, 78));
        List<Integer> solution = compareTriplets(a, b);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer scoreOfA = 0;
        Integer scoreOfB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                scoreOfA++;
            }
            if (a.get(i) < b.get(i)) {
                scoreOfB++;
            }
        }

        return new ArrayList<>(Arrays.asList(scoreOfA, scoreOfB));
    }
}

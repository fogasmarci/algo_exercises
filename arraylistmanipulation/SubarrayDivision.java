package arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> numberOfBars = new ArrayList<>(List.of(4));
        int numberToGet = 4;
        int numberOfAdditions = 1;
        System.out.println(birthday(numberOfBars, numberToGet, numberOfAdditions));
    }

    public static int birthday(List<Integer> s, int toGet, int additions) {
        int numberOfSolutions = 0;

        for (int i = 0; i <= s.size() - additions; i++) {
            int addItUntilYouMakeIt = 0;
            for (int j = 0; j < additions - 1; j++) {
                addItUntilYouMakeIt += s.get(i + j);
            }
            if (addItUntilYouMakeIt == toGet) {
                numberOfSolutions++;
            }
        }

        return numberOfSolutions;
    }
}

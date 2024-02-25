package arraylistmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 0, -1, -1));
        plusMinus(numbers);
    }

    public static void plusMinus(List<Integer> arr) {
        int numberOfElements = arr.size();
        double numberOfPositives = 0.0;
        double numberOfNegatives = 0.0;
        double numberOfZeros = 0.0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                numberOfPositives++;
            }
            if (arr.get(i) < 0) {
                numberOfNegatives++;
            }
            if (arr.get(i) == 0) {
                numberOfZeros++;
            }
        }


        System.out.println(numberOfPositives / numberOfElements);
        System.out.println(numberOfNegatives / numberOfElements);
        System.out.println(numberOfZeros / numberOfElements);
    }
}

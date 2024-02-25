package arraymanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class birthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4));
        System.out.println(birthdayCakeCandles(candles));
    }


    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int numberOfMax = 1;

        for (int i = 1; i < candles.size(); i++) {
            int currentHeight = candles.get(i);

            if (currentHeight > max) {
                max = currentHeight;
                numberOfMax = 1;
            } else if (currentHeight == max) {
                numberOfMax++;
            }
        }

        return numberOfMax;
    }

}

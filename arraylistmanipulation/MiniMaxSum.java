package arraylistmanipulation;

import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        Integer min = 0;
        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
        }

        Integer max = 0;
        for (int i = 4; i >= 1; i--) {
            max += arr.get(i);
        }

        System.out.print(min + " " + max);
    }
}

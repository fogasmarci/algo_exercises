package arraylistmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> lineOne = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> lineTwo = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> lineThree = new ArrayList<>(Arrays.asList(9, 8, 9));
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(lineOne, lineTwo, lineThree));

        System.out.println(diagonalDifference(matrix));
        System.out.println("-----");
        System.out.println(difference(matrix));
    }

    public static int diagonalDifference(List<List<Integer>> matrix) {
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                if (i == j) {
                    diagonal1 += matrix.get(i).get(j);
                }
            }
        }

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = matrix.size() - 1; j >= 0; j--) {
                int s = matrix.size() - 1;
                if (i + j == s) {
                    diagonal2 += matrix.get(i).get(j);
                }
            }
        }

        return Math.abs(diagonal1 - diagonal2);
    }

    public static int difference(List<List<Integer>> matrix) {
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < matrix.size(); i++) {
            diagonal1 += matrix.get(i).get(i);
            diagonal2 += matrix.get(i).get(matrix.size() - 1 - i);
        }

        return Math.abs(diagonal1 - diagonal2);
    }
}

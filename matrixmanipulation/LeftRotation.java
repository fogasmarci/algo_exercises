package matrixmanipulation;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        rotLeft(a, 4);
    }

    public static void rotLeft(List<Integer> a, int d) {
        List<Integer> rotatedNumbers = new ArrayList<>(a);

        for (int i = 0; i < a.size(); i++) {
            if (i - d >= 0) {
                rotatedNumbers.set(i - d, a.get(i));
            }
            if (i - d < 0) {
                rotatedNumbers.set(a.size() + (i - d), a.get(i));
            }
        }

        System.out.println(rotatedNumbers.get(0) + " " + rotatedNumbers.get(1) + " " + rotatedNumbers.get(2)
                + " " + rotatedNumbers.get(3) + " " + rotatedNumbers.get(4));
    }
}

package arraylistmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RansomNote {
    public static void main(String[] args) {
        boolean possible = true;
        String magazinee = "give me one grand today night";
        String ransom = "give one grand today";
        int numberOfWordsFound = 0;

        String[] mArray = magazinee.split(" ");
        String[] rArray = ransom.split(" ");
        List<String> magazine = new ArrayList<>(Arrays.asList(mArray));
        List<String> note = new ArrayList<>(Arrays.asList(rArray));

        for (String r : note) {
            for (String m : magazine) {
                if (r.equals(m)) {
                    numberOfWordsFound++;
                    magazine.remove(m);
                    break;
                }
            }
        }

        if (numberOfWordsFound != rArray.length) {
            possible = false;
        }

        if (possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

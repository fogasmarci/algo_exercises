package arraylistmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gemstones {
    public static void main(String[] args) {
        String rockOne = "abc";
        String rockTwo = "bac";
        String rockThree = "ac";
        String rockFour = "cacc";
        String rockFive = "l";

        List<String> collectionOfRocks = new ArrayList<>(Arrays.asList(rockOne, rockTwo, rockThree, rockFour, rockFive));
        System.out.println(gemstones(collectionOfRocks));
    }

    public static int gemstones(List<String> arr) {

        int numberOfGemstones = 0;
        int numberOfRocksContainingMineral = 0;
        String firstRock = arr.get(0);
        List<String> mineralsFromFirstRock = new ArrayList<>(Arrays.asList(firstRock.split("")));

        for (String mineral : mineralsFromFirstRock) {
            for (String rock : arr) {
                List<String> minerals = new ArrayList<>(Arrays.asList(rock.split("")));
                if (minerals.contains(mineral)) {
                    numberOfRocksContainingMineral++;
                }
            }
            if (numberOfRocksContainingMineral == arr.size()) {
                numberOfGemstones++;
            }
            numberOfRocksContainingMineral = 0;
        }


        return numberOfGemstones;
    }
}

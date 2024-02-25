package stringmanipulation;

public class AlternatingCharacters {
    public static void main(String[] args) {
        int numberOfDeletions = 0;
        String l = "AAABAAABBABBA";
        String[] letters = l.split("");
        StringBuilder s = new StringBuilder();
        s.append(letters[0]);

        for (int i = 1; i < letters.length; i++) {
            if (letters[i].equals(letters[i - 1])) {
                numberOfDeletions++;
            } else {
                s.append(letters[i]);
            }
        }

        System.out.println("Number of deletions: " + numberOfDeletions);
        System.out.println("String: " + s);
    }
}

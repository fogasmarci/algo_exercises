package arraymanipulation;

public class CamelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(camelcase(s));
    }

    public static int camelcase(String s) {
        int numberOfWords = 1;
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isUpperCase(letters[i])) {
                numberOfWords++;
            }
        }

        return numberOfWords;
    }
}

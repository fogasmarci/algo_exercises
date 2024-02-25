package stringmanipulation;

public class SuperReducedString {
    public static void main(String[] args) {
        String randomWord = "abkball";
        System.out.println(superReducedString(randomWord));
    }

    public static String superReducedString(String randomWord) {
        StringBuilder result = new StringBuilder();

        for (char c : randomWord.toCharArray()) {
            int len = result.length();

            if (len > 0 && result.charAt(len - 1) == c) {
                result.deleteCharAt(len - 1);
            } else {
                result.append(c);
            }
        }

        return result.length() == 0 ? "Empty String" : result.toString();
    }
}

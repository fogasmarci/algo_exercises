package arraymanipulation;

public class TwoStrings {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        System.out.println(shareCommonString(a, b));

    }

    public static boolean shareCommonString(String a, String b) {
        String[] lettersA = a.split("");
        String[] lettersB = b.split("");

        for (int i = 0; i < lettersA.length; i++) {
            for (int j = 0; j < lettersB.length; j++) {
                if (lettersB[j].equals(lettersA[i])) {
                    return true;
                }
            }
        }

        return false;
    }
}

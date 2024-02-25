package stringmanipulation;

public class SuperReducedString2 {
    public static void main(String[] args) {
        System.out.println(superReducedString("abba"));
    }

    public static String superReducedString(String s) {
        char[] letters = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(letters[0]);

        for (int i = 1; i < letters.length; i++) {
            int len = sb.length() - 1;
            if (len >= 0 && sb.charAt(len) == letters[i]) {
                sb.deleteCharAt(len);
            } else {
                sb.append(letters[i]);
            }
        }

        if (sb.isEmpty()) {
            return "Empty String";
        }

        return sb.toString();
    }
}


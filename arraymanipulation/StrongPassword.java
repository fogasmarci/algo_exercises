package arraymanipulation;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "2bbbb";
        int n = 5;
        System.out.println(minimumNumber(5, password));
    }

    public static int minimumNumber(int n, String password) {
        StringBuilder sb = new StringBuilder(password);
        String[] letters = password.split("");
        int chToAdd = 0;
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecial = false;

        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            if (numbers.contains(letters[i])) {
                hasNumber = true;
            }

            if (lowerCase.contains(letters[i])) {
                hasLowerCase = true;
            }

            if (upperCase.contains(letters[i])) {
                hasUpperCase = true;
            }

            if (specialCharacters.contains(letters[i])) {
                hasSpecial = true;
            }
        }

        if (!hasNumber) {
            sb.append("0");
            chToAdd++;
        }

        if (!hasLowerCase) {
            sb.append("a");
            chToAdd++;
        }

        if (!hasUpperCase) {
            sb.append("A");
            chToAdd++;
        }

        if (!hasSpecial) {
            sb.append("@");
            chToAdd++;
        }

        if (sb.length() < 6) {
            int x = 6 - sb.length();
            for (int i = 0; i < x; i++) {
                chToAdd++;
                sb.append("a");
            }
        }

        return chToAdd;
    }
}

package Core;

public class PrefixCount {

    public static int findMismatchIndex(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Input strings cannot be null.");
        }

        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return i; // Mismatch found at index i
            }
        }

        // If one string is a prefix of the other only if minLength is not 0
        if (minLength!=0 && (str1.length() == minLength || str2.length() == minLength)) {
            return -1; // One string is a complete prefix of the other
        }

        return minLength; // This line should not be reached, but added for safety
    }
}


package Core;

public class PalindromeCheck {
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new NullPointerException("Input string cannot be null.");
        }

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

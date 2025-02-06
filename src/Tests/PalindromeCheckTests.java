package Tests;

import Core.PalindromeCheck;
import Core.PrefixCount;
import TestingFrameWork.AssertionResult;
import TestingFrameWork.Assertions;
import TestingFrameWork.Constants.AssertStatus;

public class PalindromeCheckTests {
    private static int passedTests = 0;
    private static int failedTests = 0;

    public static void runTests() {
        System.out.println("\n Palindrome Check Tests");
        palindromeCheckTrue("malayalam"); // should return true and test passed
        palindromeCheckTrue("hello"); // should return false and test failed
        palindromeCheckFalse("level"); // should return true and test failed
        palindromeCheckFalse("hello"); // should return false and test passed

         // Print Summary
         System.out.println("\nTest Summary:");
         System.out.println("Passed: " + passedTests);
         System.out.println("Failed: " + failedTests);
    }

    private static void updateTestStatus(AssertionResult result) {
        System.out.println(result.getMessage());
        if (result.getStatus() == AssertStatus.PASS) {
            passedTests++;
        } else {
            failedTests++;
        }
    }
    private static void palindromeCheckTrue(String str) {
        AssertionResult result = Assertions.assertTrue(PalindromeCheck.isPalindrome(str));
        updateTestStatus(result);
    }
    private static void palindromeCheckFalse(String str) {
        AssertionResult result = Assertions.assertFalse(PalindromeCheck.isPalindrome(str));
        updateTestStatus(result);
    }
}

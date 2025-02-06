package Tests;

import Core.PrefixCount;
import TestingFrameWork.AssertionResult;
import TestingFrameWork.Assertions;
import TestingFrameWork.Constants.AssertStatus;

public class PrefixCountTests {

    private static int passedTests = 0;
    private static int failedTests = 0;

    public static void runTests() {
        System.out.println("\n Prefix count Tests");
        testMismatchIndex("hello", "helio", 3); // Mismatch at index 3
        testMismatchIndex("test", "team", 1); // To test failed scenario I'm giving expected as 1 even though the mismatch is at 2
        testMismatchIndex("hello", "hell", -1); // "hell" is a prefix of "hello"
        testMismatchIndex("hell", "hello", -1); // "hell" is still a prefix
        testMismatchIndex("abc", "", 0); // No prefix match, mismatch at index 0
        testMismatchException(null, "hello", NullPointerException.class);

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
    private static void testMismatchIndex(String str1, String str2, int expected) {
        AssertionResult result = Assertions.assertEquals(expected, PrefixCount.findMismatchIndex(str1, str2));
        updateTestStatus(result);
    }
    private static void testMismatchException(String str1, String str2, Class<? extends Throwable> expected) {
        AssertionResult result = Assertions.assertException(() -> { PrefixCount.findMismatchIndex(str1, str2); }, expected);
        updateTestStatus(result);
    }
}

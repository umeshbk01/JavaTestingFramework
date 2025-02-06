package Tests;

import Core.Search;
import TestingFrameWork.AssertionResult;
import TestingFrameWork.Assertions;
import TestingFrameWork.Constants.AssertStatus;

public class BinarySearchTests {

    private static int passedTests = 0;
    private static int failedTests = 0;

    public static void runTests() {
        System.out.println("\nBinary Search test cases: ");
        testBinarySearch(new int[]{1, 3, 5, 7, 9, 11}, 5, 2);
        testBinarySearch(new int[]{1, 3, 5, 7, 9, 11}, 4, -1);
        testBinarySearch(new int[]{1, 3, 5, 7, 9, 11}, 4, 1);
        
        testBinarySearch(new char[]{'a', 'c', 'e', 'g', 'i', 'k'}, 'c', 1);
        testBinarySearch(new char[]{'a', 'c', 'e', 'g', 'i', 'k'}, 'd', -1);

        testBinarySearch(new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, 4.4f, 3);
        testBinarySearch(new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, 6.6f, -1);

        System.out.println("\nTest Summary:");
        System.out.println("Total Passed Tests: " + passedTests);
        System.out.println("Total Failed Tests: " + failedTests);
    }

    private static void evaluateResult(AssertionResult result) {
        System.out.println(result.getMessage());
        if (result.getStatus() == AssertStatus.PASS) {
            passedTests++;
        } else {
            failedTests++;
        }
    }

    private static void testBinarySearch(int[] array, int key, int expectedIndex) {
        AssertionResult result = Assertions.assertEquals(expectedIndex, Search.binarySearch(array, key));
        evaluateResult(result);
    }

    private static void testBinarySearch(char[] array, char key, int expectedIndex) {
        AssertionResult result = Assertions.assertEquals(expectedIndex, Search.binarySearch(array, key));
        evaluateResult(result);
    }

    private static void testBinarySearch(float[] array, float key, int expectedIndex) {
        AssertionResult result = Assertions.assertEquals(expectedIndex, Search.binarySearch(array, key));
        evaluateResult(result);
    }
}
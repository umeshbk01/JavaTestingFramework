import Core.PrefixCount;
import TestingFrameWork.AssertionResult;
import TestingFrameWork.Assertions;
import Tests.BinarySearchTests;
import Tests.PalindromeCheckTests;
import Tests.PrefixCountTests;

public class Main{
    public static void main(String[] args){

        BinarySearchTests.runTests();
        PrefixCountTests.runTests();
        PalindromeCheckTests.runTests();
    }
}
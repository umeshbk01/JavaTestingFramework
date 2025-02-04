import TestingFrameWork.AssertionResult;
import TestingFrameWork.Assertions;

public class Main{
    public static void main(String[] args){
        AssertionResult res = Assertions.assertEquals(1, 1);
        System.out.println("Status: " + res.getStatus() + " Message: "+ res.getMessage());

        AssertionResult res2 = Assertions.assertEquals(1, 2);
        System.out.println("Status: " + res2.getStatus() + " Message: "+ res2.getMessage());
    }
}
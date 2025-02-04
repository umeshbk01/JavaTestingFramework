package TestingFrameWork;

import TestingFrameWork.Constants.AssertStatus;

public class FalseAssertion implements AssertionHandler{

    @Override
    public AssertionResult assertCondition(Object actual, Object expected) {
        if(!(actual instanceof Boolean)){
            return new AssertionResult(AssertStatus.FAIL, "Failed: The Object is not of Boolean type.");
        }
        if(((Boolean) actual==true)){
            return new AssertionResult(AssertStatus.FAIL, "Failed: Expected it to be false, but it's true");
        }
        return new AssertionResult(AssertStatus.PASS, "Passed: Condition is false");
    }
    
}

package TestingFrameWork;

import TestingFrameWork.Constants.AssertStatus;

public class TrueAssertion implements AssertionHandler{

    @Override
    public AssertionResult assertCondition(Object actual, Object expected) {
        if(!(actual instanceof Boolean)){
            return new AssertionResult(AssertStatus.FAIL, "Failed: The Object is not of Boolean type.");
        }
        if(((Boolean) actual==false)){
            return new AssertionResult(AssertStatus.FAIL, "Failed:Expected it to be true, but it's false");
        }
        return new AssertionResult(AssertStatus.PASS, "Passed: Condition is true");
    }
    
}

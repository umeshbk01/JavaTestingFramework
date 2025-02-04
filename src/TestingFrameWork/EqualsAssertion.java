package TestingFrameWork;

import TestingFrameWork.Constants.AssertStatus;

public class EqualsAssertion implements AssertionHandler{

    @Override
    public AssertionResult assertCondition(Object actual, Object expected) {
        if(expected != null && actual !=null && expected.equals(actual)){
            return new AssertionResult(AssertStatus.PASS, "Passed: Values are equal");
        }
        return new AssertionResult(AssertStatus.FAIL, "Failed: Values are not equal");
    }
    
}

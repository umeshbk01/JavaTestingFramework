package TestingFrameWork;

import TestingFrameWork.Constants.AssertStatus;

public class NotNullAssertion implements AssertionHandler{

    @Override
    public AssertionResult assertCondition(Object actual, Object expected) {
        if (actual == null) {
            return new AssertionResult(AssertStatus.FAIL, "Failed: Expected object to be not null.");
        }
        return new AssertionResult(AssertStatus.PASS, "Passed: Object is not null.");   
    }
    
}

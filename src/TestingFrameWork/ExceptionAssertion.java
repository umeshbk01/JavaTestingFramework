package TestingFrameWork;

import TestingFrameWork.Constants.AssertStatus;

public class ExceptionAssertion implements AssertionHandler{
    @Override
    public AssertionResult assertCondition(Object actual, Object expected) {
        
        if (!(actual instanceof Runnable)) {
            return new AssertionResult(AssertStatus.FAIL, "Invalid type, must be a Runnable function.");
        }

        Class<? extends Throwable> expectedException = (Class<? extends Throwable>) expected;
        Runnable executable = (Runnable) actual;

        try {
            executable.run();  // Run the test code
            return new AssertionResult(AssertStatus.FAIL, "Expected " + expectedException.getSimpleName() + " but no exception was thrown.");
        } catch (Throwable e) {
            return expectedException.isInstance(e)
                ? new AssertionResult(AssertStatus.PASS, "Expected exception " + expectedException.getSimpleName() + " was thrown.")
                : new AssertionResult(AssertStatus.FAIL, "Expected " + expectedException.getSimpleName() + " but got " + e.getClass().getSimpleName());
        }
    }
}

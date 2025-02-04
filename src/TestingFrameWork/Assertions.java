package TestingFrameWork;

public class Assertions {
    public static AssertionResult assertEquals(Object actual, Object expected){
        return new EqualsAssertion().assertCondition(actual, expected);
    }

    public static AssertionResult assertTrue(Object actual){
        return new TrueAssertion().assertCondition(actual, null);
    }

    public static AssertionResult assertFalse(Object actual){
        return new FalseAssertion().assertCondition(actual, null);
    }

    public static AssertionResult assertNotNull(Object actual){
        return new NotNullAssertion().assertCondition(actual, null);
    }

}

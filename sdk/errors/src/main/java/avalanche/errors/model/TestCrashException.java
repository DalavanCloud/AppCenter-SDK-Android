package avalanche.errors.model;

/**
 * Exception for test crash
 */
public class TestCrashException extends RuntimeException {

    public TestCrashException() {
        super("Test crash exception generated by SDK");
    }
}
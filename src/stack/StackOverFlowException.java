package stack;

/**
 * Created by bhargav on 1/5/16.
 */
public class StackOverFlowException extends RuntimeException {

    public StackOverFlowException() {
        this("Stack Overflow Exception");
    }

    public StackOverFlowException(String message) {
        super(message);
    }
}

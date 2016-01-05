package stack;

/**
 * Created by bhargav on 1/5/16.
 */
public class StackUnderFlowException extends RuntimeException {

    public StackUnderFlowException() {
        this("Stack is empty.");
    }

    public StackUnderFlowException(String message) {
        super(message);
    }
}

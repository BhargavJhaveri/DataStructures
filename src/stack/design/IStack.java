package stack.design;

import stack.exception.StackOverFlowException;
import stack.exception.StackUnderFlowException;

/**
 * Created by bhargav on 1/4/16.
 */
public interface IStack<T> {

    void push(T element) throws StackOverFlowException;

    T pop() throws StackUnderFlowException;

    T peek() throws StackUnderFlowException;

    boolean isEmpty();

}

package stack.implementation;

import stack.design.IStack;
import stack.exception.StackOverFlowException;
import stack.exception.StackUnderFlowException;

/**
 * Created by bhargav on 1/4/16.
 */
public class CustomStackArray<T> implements IStack<T> {

    private T[] stackElements;
    private static final int DEFAULT_CAPACITY = 20;
    private int stackPointer = -1;
    int stackSize;

    public CustomStackArray(int size) {
        this.stackSize = size;
        stackElements = (T[]) new Object[size];
    }

    public CustomStackArray() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void push(T element) throws StackOverFlowException {
        if (stackPointer < stackSize) {
            stackElements[++stackPointer] = element;
            System.out.println("Pushed element is:" + element.toString());
        } else {
            throw new StackOverFlowException("Element cannot be pushed.");
        }

    }

    @Override
    public T pop() throws StackUnderFlowException {
        if (stackPointer >= 0) {
            T element = stackElements[stackPointer--];
            System.out.println("Popped element is:" + element.toString());
            return element;
        } else {
            throw new StackUnderFlowException("Stack is empty. What are you trying to do?");
        }

    }

    @Override
    public T peek() throws StackUnderFlowException {
        if (stackPointer >= 0) {
            T element = stackElements[stackPointer];
            System.out.println("Element at the top is:" + element.toString());
            return element;
        } else {
            throw new StackUnderFlowException("Stack is empty. What are you trying to do?");
        }
    }

    @Override
    public boolean isEmpty() {

        boolean isStackEmpty = stackPointer == -1;
        System.out.println("Is stack empty? " + isStackEmpty);
        return (isStackEmpty);
    }
}

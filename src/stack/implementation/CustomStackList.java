package stack.implementation;

import customLinkedList.ILinkedList;
import customLinkedList.LinkedList;
import stack.design.IStack;
import stack.exception.StackOverFlowException;
import stack.exception.StackUnderFlowException;

/**
 * Created by bhargav on 1/5/16.
 */
public class CustomStackList<T> implements IStack<T> {

    ILinkedList linkedList;

    public CustomStackList() {
        linkedList = new LinkedList();
    }

    @Override
    public void push(T element) throws StackOverFlowException {
        try {
            linkedList.add(element);
        }catch (StackOverflowError stackOverflowError) {
            throw new StackOverFlowException("Stack overflow error");
        }

        System.out.println("Pushed element is:" + element.toString());
    }

    @Override
    public T pop() throws StackUnderFlowException {

        if (linkedList.size() > 0) {
            T element = (T) linkedList.get(linkedList.size() - 1);
            linkedList.remove(element);

            System.out.println("Popped element is:" + element.toString());
            return element;
        } else {
            throw new StackUnderFlowException();
        }
    }

    @Override
    public T peek() throws StackUnderFlowException {
        if (linkedList.size() > 0) {
            T element = (T) linkedList.get(linkedList.size()  - 1);
            System.out.println("Element at the top is:" + element.toString());
            return element;
        } else {
            throw new StackUnderFlowException();
        }
    }

    @Override
    public boolean isEmpty() {
        boolean isStackEmpty = (linkedList.size() == 0);
        System.out.println("Is stack empty?" + isStackEmpty);
        return (isStackEmpty);
    }
}

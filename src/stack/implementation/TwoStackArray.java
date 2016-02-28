package stack.implementation;

import stack.exception.StackOverFlowException;
import stack.exception.StackUnderFlowException;

/**
 * Created by bhargav on 1/20/16.
 */
public class TwoStackArray<T> {
    int size;
    T stack[];
    int top1;
    int top2;

    public TwoStackArray(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        this.top1 = -1;
        this.top2 = size;
    }

    public void pushElementInStack1(T element1) {
        if (top2 - top1 > 1) {
            stack[++top1] = element1;
        } else {
            throw new StackOverFlowException();
        }
    }

    public void pushElementInStack2(T element2) {
        if (top2 - top1 > 1) {
            stack[--top2] = element2;
        } else {
            throw new StackOverFlowException();
        }
    }

    public T popElementFromStack1() {

        if (top1 > -1) {
            return stack[top1--];
        } else {
            throw new StackUnderFlowException();
        }

    }

    public T popElementFromStack2() {

        if (top2 < size) {
            return stack[top2++];
        } else {
            throw new StackUnderFlowException();
        }

    }


}

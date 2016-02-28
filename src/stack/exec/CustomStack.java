package stack.exec;

import stack.design.IStack;
import stack.implementation.CustomStackArray;
import stack.implementation.CustomStackList;
import stack.operation.StackOperations;

/**
 * Created by bhargav on 1/4/16.
 */
public class CustomStack {

    public static void main(String[] args) {
//        createStackFromArray();
//
//        System.out.println("Now using Linked List");
//
//        createStackFromList();

        performOperation1();

    }

    private static void performOperation1() {
        StackOperations stackOperations = new StackOperations();

//        String reversed = stackOperations.reverseStringUsingStack("Bhargav Jhaveri");
//        System.out.println(reversed);
//
//        stackOperations.twoStackOperations();
//        System.out.println("Is it palindrome? " + StackOperations.isStringPalindrome("Bhargav"));
//        System.out.println("Is it palindrome? " + StackOperations.isStringPalindrome("ABCBA"));
//
//        System.out.println("Is expression proper? " + StackOperations.isExpressionProper("[[{{(A+B)}}]]"));
//        System.out.println("Is expression proper? " + StackOperations.isExpressionProper("[[{{(A-9)}}]]"));

        StackOperations.countNumberOfReversals("{{{{}}}}");
        StackOperations.countNumberOfReversals("{{{{}}}}}{");
        StackOperations.countNumberOfReversals("}}{{{{}}}}{{");
        StackOperations.countNumberOfReversals("{{{{}}}}}");
        StackOperations.countNumberOfReversals("}}}{{{{{");
    }



    public static void createStackFromArray() {
        IStack<Integer> integerStack = new CustomStackArray<>();
        integerStack.push(100);
        integerStack.push(500);
        integerStack.push(1000);

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        IStack<String> stringStack = new CustomStackArray<>(10);
        stringStack.push("Bhargav");
        stringStack.push("Jhaveri");

        stringStack.push("Iron");
        stringStack.push("Man");

        stringStack.isEmpty();
        stringStack.peek();

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        stringStack.isEmpty();
    }

    public static void createStackFromList() {
        IStack<Integer> integerStack = new CustomStackList<>();
        integerStack.push(100);
        integerStack.push(500);
        integerStack.push(1000);

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        IStack<String> stringStack = new CustomStackList<>();
        stringStack.push("BhargavList");
        stringStack.push("JhaveriList");

        stringStack.push("Iron");
        stringStack.push("Man");

        stringStack.isEmpty();
        stringStack.peek();

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        stringStack.isEmpty();
    }
}

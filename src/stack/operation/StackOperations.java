package stack.operation;

import stack.design.IStack;
import stack.implementation.CustomStackArray;
import stack.implementation.TwoStackArray;

/**
 * Created by bhargav on 1/18/16.
 */
public class StackOperations {

    public String reverseStringUsingStack(String string) {

        int length = string.length();

        IStack<Character> stack = new CustomStackArray<>(length);

        for (int i = 0; i < length; i++) {
            stack.push(string.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < length; i++) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();

    }

    public void twoStackOperations() {

        TwoStackArray<Integer> twoStackArray = new TwoStackArray<>(10);
        for (int i = 0; i < 5; i++) {
            twoStackArray.pushElementInStack1(i);
        }

        for (int i = 10; i < 15; i++) {
            twoStackArray.pushElementInStack2(i);
        }

        System.out.println(twoStackArray.popElementFromStack1());
        System.out.println(twoStackArray.popElementFromStack1());
        System.out.println(twoStackArray.popElementFromStack1());
        System.out.println(twoStackArray.popElementFromStack1());
        System.out.println(twoStackArray.popElementFromStack1());
//        System.out.println(twoStackArray.popElementFromStack1());

        System.out.println(twoStackArray.popElementFromStack2());
        System.out.println(twoStackArray.popElementFromStack2());
        System.out.println(twoStackArray.popElementFromStack2());
        System.out.println(twoStackArray.popElementFromStack2());
        System.out.println(twoStackArray.popElementFromStack2());

    }

    public static boolean isStringPalindrome(String string) {


        String input = string;
        int length = input.length();

        IStack<Character> characterIStack = new CustomStackArray<>();

        for (int i = 0; i < length; i++) {
            characterIStack.push(input.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            if (characterIStack.pop() != input.charAt(i)) {
                return false;
            }
        }


        return true;
    }

    public static boolean isExpressionProper(String expression) {

        int length = expression.length();
        IStack<Character> stack = new CustomStackArray<>(length);

        char[] charArray = expression.toCharArray();

        for (int i = 0; i < length; i++) {

            char iteratingChar = charArray[i];

            switch (iteratingChar) {
                case '{':
                case '[':
                case '(':
                    stack.push(iteratingChar);
                    break;
                case '}':
                    if (stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.pop() != '(') {
                        return false;
                    }
                    break;
                default:
                    break;
            }

        }


        return true;
    }

    public static void countNumberOfReversals(String expression) {

        char[] charArray = expression.toCharArray();

        int length = charArray.length;
        if (length % 2 == 1) {
            System.out.println("Odd number, cannot be balanced.");
            return;
        }

        IStack<Character> stack = new CustomStackArray<>(length);

        /*
        This will remove the balanced { and } part. And will leave only unbalanced part.
         */
        for (char charElement : charArray) {
            if (charElement == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push('}');
                }
            } else {
                stack.push('{');
            }
        }

        int unbalancedPart = stack.getSize();
        int openingBraceCounter = 0;

        for (int i = 0; i < unbalancedPart; i++) {
            if (stack.pop() == '{') {
                openingBraceCounter++;
            }
        }

        System.out.println("Number of required reversals : " + (Math.ceil(openingBraceCounter / 2) + Math.ceil
                (unbalancedPart - openingBraceCounter)));

    }

}

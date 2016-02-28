import customLinkedList.ILinkedList;
import customLinkedList.LinkedList;
import customLinkedList.Node;
import operations.Operation1;
import operations.Operation2;
import operations.SwapElements;

/**
 * Created by Bhargav Jhaveri on 02-Nov-15.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        customLinkedList();

//        customOperation1();
        customOperation2();
    }

    private static void customOperation2() {
        LinkedList linkedList = new LinkedList();

        Operation2 operation2 = new Operation2(linkedList);

        operation2.sortedInsert(new Node(2));
        operation2.sortedInsert(new Node(5));
        operation2.sortedInsert(new Node(4));
        operation2.sortedInsert(new Node(1));
        operation2.sortedInsert(new Node(8));
        operation2.sortedInsert(new Node(3));

        linkedList.printLinkedList();

    }

    private static void customOperation1() {
        LinkedList linkedList = new LinkedList();

        System.out.println("Adding elements begin \n");
        for (int i = 1; i < 15; i += 2) {
            linkedList.add(String.valueOf(i));
        }

        linkedList.printLinkedList();

        Operation1 operation1 = new Operation1(linkedList);
        operation1.getReversedLinkedList().printLinkedList();
        operation1.reverseLinkedListRecursive(linkedList.getHeadNode()).printLinkedList();
//        linkedList.printLinkedList();
    }


    private static void customLinkedList() {
        LinkedList linkedList = new LinkedList();

        System.out.println("Adding elements begin \n");
        for (int i = 0; i < 50; i++) {
            linkedList.add(String.valueOf(i));
        }

        System.out.println("Elements added. Now printing begins...  \n");

        linkedList.printLinkedList();

        System.out.println("Adding an element");
        linkedList.add("80", 9);
        System.out.println("Elements added. Now printing begins...  \n");
        linkedList.printLinkedList();


        System.out.println("Printing ends...\n");

        System.out.println("Size of linked list is: " + linkedList.size());

        getElementIndexTest(linkedList);
        getElementTest(linkedList);

        System.out.println(linkedList.contains("-1"));

        removeObjects(linkedList);
        removeObjectAtIndex(linkedList);

        swapElements(linkedList);


    }

    private static void swapElements(LinkedList linkedList) {
        SwapElements swapElements = new SwapElements(linkedList);
        swapElements.swapElements("4", "48");

        linkedList.printLinkedList();
    }

    private static void getElementIndexTest(LinkedList linkedList) {
        String element;

        int index;

        element = "0";
        generateIndexMessage(linkedList, element);

        element = "1";
        generateIndexMessage(linkedList, element);


        element = "80";
        generateIndexMessage(linkedList, element);

        element = "49";
        generateIndexMessage(linkedList, element);

        element = "51";
        generateIndexMessage(linkedList, element);
    }

    private static void generateIndexMessage(LinkedList linkedList, String element) {
        int index;
        index = linkedList.get(element);
        if (index == ILinkedList.ELEMENT_NOT_FOUND) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element " + element + "is at index: " + index);
        }
    }

    private static void getElementTest(LinkedList linkedList) {
        Object object;

        int index = -1;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 0;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 8;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 9;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 10;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 25;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 49;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 50;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);

        index = 51;
        object = linkedList.get(index);
        System.out.println("Object at " + index + " is " + object);


    }

    private static void removeObjects(LinkedList linkedList) {

        linkedList.remove("0");
        linkedList.remove("25");
        linkedList.remove("49");
        linkedList.remove("80");

        linkedList.remove("-10");
        linkedList.remove("-1");
        linkedList.remove("81");
        linkedList.remove("79");
        linkedList.remove("ASB");

        linkedList.printLinkedList();
    }

    private static void removeObjectAtIndex(LinkedList linkedList) {
        linkedList.remove(0);
        linkedList.remove(1);
        linkedList.remove(linkedList.size());

        linkedList.remove(48);
        linkedList.remove(-1);
        linkedList.remove(80);

    }

}

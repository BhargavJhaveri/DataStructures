import customLinkedList.ILinkedList;
import customLinkedList.LinkedList;

/**
 * Created by Bhargav Jhaveri on 02-Nov-15.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        customLinkedList();
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

}

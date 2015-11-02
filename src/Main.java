public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkedList linkedList = new LinkedList();

        System.out.println("Adding elements begin \n");
        for (int i = 0; i < 50; i++) {
            linkedList.add(String.valueOf(i));
        }

        System.out.println("Elements added. Now printing begins...  \n");

        linkedList.printLinkedList();

        System.out.println("Adding an element");
        linkedList.add("80", 90);
        System.out.println("Elements added. Now printing begins...  \n");
        linkedList.printLinkedList();


        System.out.println("Printing ends...\n");

        System.out.println("Size of linked list is: " + linkedList.size());

    }
}

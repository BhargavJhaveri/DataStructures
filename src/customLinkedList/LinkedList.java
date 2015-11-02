package customLinkedList;

/**
 * Created by Bhargav Jhaveri on 02-Nov-15.
 */
public class LinkedList implements ILinkedList {

    // This is the head node which will be referring to the first node of the linked list.
    private Node headNode;

    //    private customLinkedList.Node node;
    private int size;


    public LinkedList() {
        this.headNode = new Node(null);
    }

    @Override
    public void add(Object object) {

//        customLinkedList.Node node = new customLinkedList.Node(object);
//
//        customLinkedList.Node lastNode = this.headNode;
//
//        while (lastNode.getNextNode() != null) {
//            lastNode = lastNode.getNextNode();
//        }
//
//        lastNode.setNextNode(node);
//
        add(object, this.size);

//        this.size++;

    }

    @Override
    public void add(Object object, int index) {

        Node node = new Node(object);

        if (index <= this.size) {

            Node lastNode = this.headNode;
            int counter = 0;

            while (lastNode.getNextNode() != null && counter != index) {
                lastNode = lastNode.getNextNode();
                counter++;
            }

            Node nextNode = lastNode.getNextNode();

            lastNode.setNextNode(node);
            node.setNextNode(nextNode);


        } else {
            throw new IndexOutOfBoundsException("Trying to insert at an index beyond size of " +
                    "linked list");
        }

        this.size++;

    }

    @Override
    public void remove(Object object) {
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public void get(Object object) {
    }

    @Override
    public void get(int index) {
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public void printLinkedList() {

        Node lastNode = this.headNode;
        while (lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
            System.out.println(lastNode.getNodeValue());

        }

    }
}

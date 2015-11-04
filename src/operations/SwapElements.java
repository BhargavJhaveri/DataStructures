package operations;

import customLinkedList.LinkedList;
import customLinkedList.Node;

/**
 * Created by Bhargav Jhaveri on 03-Nov-15.
 */
public class SwapElements {

    LinkedList linkedList;
    Node headNode;

    public SwapElements(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public boolean swapElements(Object object1, Object object2) {

        this.headNode = linkedList.getHeadNode();

        Node currentNode = this.headNode;

        Node nextNode;

        Node prevNode1 = null;
        Node nextNode1 = null;
        Node node1 = null;

        Node prevNode2 = null;
        Node nextNode2 = null;
        Node node2 = null;

        nextNode = currentNode.getNextNode();
        while (null != nextNode) {

            if (nextNode.getNodeValue().equals(object1)) {
                prevNode1 = currentNode;
                nextNode1 = nextNode.getNextNode();
                node1 = nextNode;
            } else if (nextNode.getNodeValue().equals(object2)) {
                prevNode2 = currentNode;
                nextNode2 = nextNode.getNextNode();
                node2 = nextNode;
            }

            currentNode = nextNode;
            nextNode = nextNode.getNextNode();
        }

        if (null == node1 || null == node2) {
            System.out.println("Both the objects need to be present. Swapping not possible.");
            return false;
        }

        prevNode1.setNextNode(node2);
        node2.setNextNode(nextNode1);

        prevNode2.setNextNode(node1);
        node1.setNextNode(nextNode2);

        System.out.println("Elements have been swapped.");
        return true;
    }

}

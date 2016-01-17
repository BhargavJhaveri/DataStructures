package operations;

import customLinkedList.LinkedList;
import customLinkedList.Node;

/**
 * Created by bhargav on 1/16/16.
 */
public class Operation1 {

    private LinkedList linkedList;
    private Node headNode;

    public Operation1(LinkedList linkedList) {
        this.linkedList = linkedList;
        this.headNode = linkedList.getHeadNode();
    }

    public LinkedList getReversedLinkedList() {


        Node nextNode;
        Node previousNode;

        Node firstNode;
        Node secondNode;

        if (null != headNode.getNextNode()) {
            firstNode = headNode.getNextNode();
        } else {
            return linkedList;
        }

        if (null != firstNode.getNextNode()) {
            secondNode = firstNode.getNextNode();
        } else {
            return linkedList;
        }

        Node iterativeNode = secondNode;
        previousNode = firstNode;


        while (null != iterativeNode.getNextNode()) {

            nextNode = iterativeNode.getNextNode();

            iterativeNode.setNextNode(previousNode);

            previousNode = iterativeNode;

            iterativeNode = nextNode;

        }

        iterativeNode.setNextNode(previousNode);

        headNode.setNextNode(iterativeNode);

        firstNode.setNextNode(null);
        return linkedList;
    }


    public LinkedList reverseLinkedListRecursive(Node currentNode) {

        if (null == currentNode) {
            return null;
        }

        if (null == currentNode.getNextNode()) {
            if (headNode == currentNode) {
                return null;
            }
            headNode.setNextNode(currentNode);
            return null;
        }

        Node nextNode = currentNode.getNextNode();
        reverseLinkedListRecursive(nextNode);

        if (currentNode != headNode) {
            nextNode.setNextNode(currentNode);
        } else {
            nextNode.setNextNode(null);
        }

        return linkedList;

    }


}

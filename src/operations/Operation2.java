package operations;

import customLinkedList.LinkedList;
import customLinkedList.Node;

/**
 * Created by Bhargav Jhaveri on 03-Nov-15.
 */
public class Operation2 {

    private LinkedList linkedList;
    private Node headNode;

    public Operation2(LinkedList linkedList) {
        this.linkedList = linkedList;
        this.headNode = linkedList.getHeadNode();
    }

    public void start() {

        System.out.println(getMiddleNode().getNodeValue());
        System.out.println(getNthNodeFromLast(5).getNodeValue());

    }

    /**
     * Even though size is available and middle element can be computed. But here it is assumed
     * that, size is not available and hence, middle element is found using normal iteration method.
     *
     * @return
     */
    public Node getMiddleNode() {
        Node middleNode = this.headNode;

        Node currentNode = this.headNode;
        Node nextNode = currentNode.getNextNode();


        int size = 0;
        while (null != nextNode) {
            size++;

            if (size % 2 == 0) {
                middleNode = middleNode.getNextNode();
            }

            nextNode = nextNode.getNextNode();
        }

        return middleNode;
    }

    public Node getNthNodeFromLast(int n) {

        Node nthNode = this.headNode;
        Node currentNode = this.headNode;

        Node nextNode = currentNode.getNextNode();

        int size = 0;
        while (null != nextNode) {

            if (size >= n - 1) {
                nthNode = nthNode.getNextNode();
            }

            size++;
            nextNode = nextNode.getNextNode();

        }

        return nthNode;

    }

    public void sortedInsert(Node node) {

        Node iter = headNode;

        while (null != iter.getNextNode() && ((int) iter.getNextNode().getNodeValue() <= (int) node.getNodeValue())) {
            iter = iter.getNextNode();

        }

        node.setNextNode(iter.getNextNode());
        iter.setNextNode(node);


    }


}

/**
 * Created by Bhargav Jhaveri on 02-Nov-15.
 */
public class Node {

    private Object object;
    private Node nextNode;

    public Node(Object object) {
        this.object = object;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Object getNodeValue() {
        return this.object;
    }
}

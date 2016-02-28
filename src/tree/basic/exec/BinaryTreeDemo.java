package tree.basic.exec;

import tree.basic.impl.BinaryTree;

/**
 * Created by bhargav on 2/16/16.
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(18);

        binaryTree.insertNode(12);
        binaryTree.insertNode(26);
        binaryTree.insertNode(23);
        binaryTree.insertNode(27);
        binaryTree.insertNode(7);
        binaryTree.insertNode(16);

        binaryTree.preOrderTraversal();
        binaryTree.inOrderTraversal();
        binaryTree.postOrderTraversal();
    }
}

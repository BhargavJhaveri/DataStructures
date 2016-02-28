package tree.basic.impl;

import tree.basic.design.TreeNode;

/**
 * Created by bhargav on 2/16/16.
 */

public class BinaryTree {

    TreeNode rootNode;

    public BinaryTree(int data) {
        rootNode = new TreeNode(data);
    }

    public void insertNode(int data) {

        TreeNode current = rootNode;

        while (true) {

            if (data < current.getData()) {

                if (null != current.getLeftNode()) {
                    current = current.getLeftNode();
                } else {
                    current.setLeftNode(new TreeNode(data));
                    break;
                }

            } else {
                if (null != current.getRightNode()) {
                    current = current.getRightNode();
                } else {
                    current.setRightNode(new TreeNode(data));
                    break;
                }
            }
        }
    }

    public void inOrderTraversal() {
        System.out.println("Printing in order traversal...");
        inOrderTraversal(rootNode);
    }

    private void inOrderTraversal(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }

        inOrderTraversal(treeNode.getLeftNode());
        System.out.println(treeNode.getData());
        inOrderTraversal(treeNode.getRightNode());
    }

    public void preOrderTraversal() {
        System.out.println("Printing pre order traversal...");
        preOrderTraversal(rootNode);
    }

    private void preOrderTraversal(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        System.out.println(treeNode.getData());
        preOrderTraversal(treeNode.getLeftNode());
        preOrderTraversal(treeNode.getRightNode());
    }

    public void postOrderTraversal() {
        System.out.println("Printing post order traversal...");
        postOrderTraversal(rootNode);
    }

    private void postOrderTraversal(TreeNode treeNode) {

        if (null == treeNode) {
            return;
        }

        postOrderTraversal(treeNode.getLeftNode());
        postOrderTraversal(treeNode.getRightNode());
        System.out.println(treeNode.getData());
    }
}

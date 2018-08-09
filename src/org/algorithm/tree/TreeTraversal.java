package org.algorithm.tree;

public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BTreePrinter.printNode(root);
        printInOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }

    private static void printInOrderTraversal(Node root) {

        if (root == null) {
            return;
        }
        printInOrderTraversal(root.left);
        ;
        System.out.print(root.data);
        printInOrderTraversal(root.right);

    }

    private static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printInOrderTraversal(root.left);
        ;

        printInOrderTraversal(root.right);

    }

    private static void postOrderTraversal(Node root) {

        if (root == null) {
            return;
        }
        printInOrderTraversal(root.left);
        ;
        printInOrderTraversal(root.right);
        System.out.println(root.data);

    }
}
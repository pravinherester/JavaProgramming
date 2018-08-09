package org.algorithm.tree;

public class DeleteNode {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.left = new Node(9);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.right = new Node(7);
        BTreePrinter.printNode(root);
        // DeleteNode(root, 14);
        // BTreePrinter.printNode(root);
        DeleteChildNode(root, 8);
         BTreePrinter.printNode(root);
    }

    private static Node DeleteNode(Node root, int i) {

        if (root.left == null && root.right == null)
            return null;
        if ((int) root.data < i)
            root.right = DeleteNode(root.right, i);

        if ((int) root.data > i)
            root.left = DeleteNode(root.left, i);
        return root;

    }

    private static Node DeleteChildNode(Node root, int i) {

        if (root.left == null && root.right == null)
            return null;
        else if (root.left == null)
            return root.right;

        else if (root.right == null)
            return root.left;

        
        root.data = (int) minValue(root.right);
        root.right = DeleteChildNode(root.right, (int) root.data);

        if ((int) root.data < i) {
            System.out.println(root.data);
            root.right = DeleteChildNode(root.right, i);
        }
        if ((int) root.data > i) {
            System.out.println(root.data);
            root.left = DeleteChildNode(root.left, i);
        }
        return root;

    }

    private static int minValue(Node root) {
        int minvalue = 0;
        if (root.left == null)
            return (int) root.data;
        minvalue = minValue(root.left);

        return minvalue;
    }
}

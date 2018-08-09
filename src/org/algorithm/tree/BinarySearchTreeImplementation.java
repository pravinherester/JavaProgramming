package org.algorithm.tree;

public class BinarySearchTreeImplementation {

    private Node root;

    public static void main(String[] args) {

        BinarySearchTreeImplementation bil = new BinarySearchTreeImplementation();
        bil.insertData(10);
        bil.insertData(20);
        bil.insertData(40);
        bil.insertData(30);
        bil.insertData(5);
        bil.insertData(8);
        BTreePrinter.printNode(bil.root);
        int max = bil.findMaxValue(bil.root);
        int min = bil.findMinValue(bil.root);
        System.out.println("max value: " + max);

        System.out.println("Min value :" + min);
        System.out.println(bil.getNodeHeight(bil.root));

    }

    void insertData(int data) {

        if (this.root == null) {
            this.root = new Node(data);
            return;
        }

        insertNode(root, data);
    }

    private Node insertNode(Node root, int data) {
        Node tempNode = null;

        if ((int) root.data >= data) {

            if (root.left == null) {
                root.left = new Node(data);
                return root;
            }
            tempNode = root.left;
        }

        if ((int) root.data < data) {
            if (root.right == null) {
                root.right = new Node(data);
                return root;
            }
            tempNode = root.right;
        }

        return insertNode(tempNode, data);

    }

    int findMinValue(Node root) {
        if (root.left != null) {
            return findMinValue(root.left);
        }

        return (int) root.data;

    }

    int findMaxValue(Node root) {
        if (root.right != null) {
            return findMaxValue(root.right);
        }

        return (int) root.data;

    }

    private Integer getNodeHeight(Node node) {

        if (node == null) {
            return -1;
        }

        return Math.max(getNodeHeight(node.left), getNodeHeight(node.right)) + 1;
    }
}
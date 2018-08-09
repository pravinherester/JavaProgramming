package org.algorithm.tree;

public class MaxOrMinBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(0);
        BTreePrinter.printNode(root);
        System.out.println(maxofTree(root));
        System.out.println(minofTree(root));

    }

    private static Integer maxofTree(Node tree) {
        if (tree == null)
            return Integer.MIN_VALUE;

        int res = (int) tree.data;
        int lres = maxofTree(tree.left);
        int rres = maxofTree(tree.right);
        if (res < lres)
            res = lres;
        if (res < rres)
            res = rres;

        return res;

    }

    private static Integer minofTree(Node tree) {
        if (tree == null)
            return Integer.MIN_VALUE;

        int res = (int) tree.data;
        int lres = maxofTree(tree.left);
        int rres = maxofTree(tree.right);
        if (res > lres)
            res = lres;
        if (res > rres)
            res = rres;

        return res;

    }
}

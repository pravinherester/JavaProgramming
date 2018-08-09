package org.algorithm.tree;

public class TreeSize {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.right = new Node(3);
        int sizeOfTree = sizeofTree(tree);
        System.out.println(sizeOfTree);
    }

    private static int sizeofTree(Node tree) {
        if (tree == null)
            return 0;
        else

            return sizeofTree(tree.left)+sizeofTree(tree.right) + 1;

    }
}

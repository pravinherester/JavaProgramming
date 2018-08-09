package org.linkedlist;

public class RotateLinkedList {
    public static void main(String[] args) {
        ConstructNode nodes = new ConstructNode();
        Node node = nodes.constructNodes();
        Node node1 = rotateLinkedList(node, 4);
        nodes.displayNodes(node1);
    }

    private static Node rotateLinkedList(Node node, int i) {

        Node current = node;
        Node kthNode = null;
        Node k1thNode = null;
        int countK = 0;

        while (current != null && countK < i) {
            current = current.next;
            countK++;
        }

        kthNode = current;
        k1thNode = current.next;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
        kthNode.next = null;
        node = k1thNode;
        return node;

    }

}

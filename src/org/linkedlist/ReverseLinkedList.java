package org.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ConstructNode nodes = new ConstructNode();
        Node node = nodes.constructNodes();
        nodes.displayNodes(node);
        Node reversenode = reverseLinkedList(node);
        System.out.println();
        nodes.displayNodes(reversenode);

    }

    private static Node reverseLinkedList(Node node) {
        Node current = node;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        node = previous;

        return node;

    }

}

// head -> data n1 -> data n2-> data n3 -> data null - >null
// node n1 n2 n3

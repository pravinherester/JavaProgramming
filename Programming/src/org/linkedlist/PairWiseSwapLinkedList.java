package org.linkedlist;

public class PairWiseSwapLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(4);
        node.next.next.next = new Node(6);
        // displayNodes(node);
        Node nodes = swapLinkedList(node);
        displayNodes(nodes);
    }

    private static Node swapLinkedList(Node node) {
        Node temp = node;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }

        return node;
    }

    private static void displayNodes(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

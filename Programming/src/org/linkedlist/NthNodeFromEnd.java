package org.linkedlist;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        ConstructNode nodes = new ConstructNode();
        Node n = nodes.constructNodes();
        nthNode(n, 4);
    }

    private static void nthNode(Node n, int i) {
        Node firstNode = n;
        int count = 0;
        Node secondNode = n;

        while (firstNode != null && count < i) {
            firstNode = firstNode.next;
            count++;
        }

        while (firstNode != null && secondNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;

        }

        System.out.println(secondNode.data);

    }

}

package org.linkedlist;

public class NodeIntersection {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(3);
        node1.next.next = new Node(6);
        node1.next.next.next = new Node(15);
        node1.next.next.next.next = new Node(15);
        node1.next.next.next.next.next = new Node(30);

        Node node2 = new Node(2);
        // creating second linked list
        node2.next = new Node(10);
        node2.next.next = new Node(15);
        node2.next.next.next = new Node(30);

        int node1Length = 0;
        int node2Length = 0;
        
        Node counterNode1=node1;

        while (counterNode1 != null) {
            node1Length++;
            counterNode1 = counterNode1.next;
        }

        Node counterNode2=node2;
        while (counterNode2 != null) {
            node2Length++;
            counterNode2 = counterNode2.next;
        }

        int diff = Math.subtractExact(node1Length, node2Length);
        int counter = 0;

        if (node1Length > node2Length) {
            while (node1 != null && counter < diff) {
                node1 = node1.next;
                counter++;
            }
        }

        else {
            while (node2 != null && counter < diff) {
                node2 = node2.next;
                counter++;
        }
        }
        
        while (node1 != null && node2 != null) {
            if (node1.data == node2.data) {
                System.out.println(node2.data);
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        
    }
    
}

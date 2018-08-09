package org.linkedlist;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        Node n = new Node(2);
        n.next = new Node(3);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);

        Node n1 = new Node(1);
        n1.next = new Node(7);
        n1.next.next = new Node(8);
        n1.next.next.next = new Node(9);
        n1.next.next.next.next = new Node(10);

        mergetwonodes(n, n1);

    }

    private static Node mergetwonodes(Node node1, Node node2) {
        Node head = null;
        Node sorting = null;
        
        if(node1==null)
            return node2;
        
        if(node2== null)
            return node1;
        if (node1.data <= node2.data) {
            sorting = node1;
            node1 = node1.next;

        }

        else {
            sorting = node2;
            node2 = node2.next;
        }

        head = sorting;
        System.out.println(head.data);

        while (node1 != null && node2 != null) {
            if (node1.data <= node2.data) {
                sorting.next = node1;
                sorting = node1;
                node1 = node1.next;
            }

            else {
                sorting.next = node2;
                sorting = node2;
                node2 = node2.next;
            }
        }
        
        if(node1==null)
        {
            sorting.next=node2;
        }

        
        
        if(node2==null)
        {
            sorting.next=node1;
        }
        ConstructNode node = new ConstructNode();
        node.displayNodes(head);

        return head;

    }

}

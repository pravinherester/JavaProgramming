package org.linkedlist;

public class SortLinListof012 {
    public static void main(String[] args) {
        Node n = new Node(0);
        n.next = new Node(2);
        n.next.next = new Node(1);
        n.next.next.next = new Node(2);
        n.next.next.next.next = new Node(0);
        n.next.next.next.next.next = new Node(1);
        n.next.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next.next = new Node(0);
        n.next.next.next.next.next.next.next.next = new Node(1);

        int count[] = { 0, 0, 0 };
        Node node = n;

        while (node != null) {
            count[node.data]++;
            node = node.next;
        }
        

     for (int i : count)
            System.out.println(i);
        node = n;
        int i = 0;

        while (node != null) {
            if (count[i] == 0) {
                i++;
            } else {
                node.data = i;
                count[i]--;
                node = node.next;

            }

        }
        
        ConstructNode node1=new ConstructNode();
        node1.displayNodes(n);
    }

}

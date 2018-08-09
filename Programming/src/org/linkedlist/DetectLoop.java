package org.linkedlist;

import java.util.HashSet;

public class DetectLoop {
    public static void main(String[] args) {
        ConstructNode nodes = new ConstructNode();
        Node node = nodes.constructNodes();
        node.next.next.next = node.next;
      //  nodes.displayNodes(node);
        detectLoop(node);
    }

    private static void detectLoop(Node node) {
        HashSet<Node> set = new HashSet<Node>();
        while (node != null) {
            if (set.contains(node)) {
                System.out.println("loop detected");
                System.out.println(node.data);
                node.next=null;
            }

            set.add(node);
            node = node.next;
        }
       

    }
}

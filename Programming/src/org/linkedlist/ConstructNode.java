package org.linkedlist;

public class ConstructNode {

    public Node constructNodes() {
        Node node = new Node(5);
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        Node n4 = new Node(25);
        Node n5 = new Node(30);
        Node n6 = new Node(35);
        node.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        return node;
    }
    
    public  void displayNodes(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    void deleteNode(Node node) {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
       System.gc();
 
    }
    
    
    public static void main(String[] args) {
        ConstructNode nodes=new ConstructNode();
        Node node=nodes.constructNodes();
        nodes.deleteNode(node);
        nodes.displayNodes(node);
    }
}

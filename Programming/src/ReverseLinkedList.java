
public class ReverseLinkedList {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(4);
        node.next.next.next = new Node(6);
        // displayNodes(node);
        Node nodes = reverseLinkedList(node);
        displayNodes(nodes);
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

    private static void displayNodes(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }

}

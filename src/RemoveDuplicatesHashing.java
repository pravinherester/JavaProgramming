import java.util.Hashtable;

public class RemoveDuplicatesHashing {

    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(2);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        removeDuplicates(node);
        displayNodes(node);
    }

    private static void removeDuplicates(Node node) {
        Node previous = null;
        Hashtable table = new Hashtable();
        while (node != null) {

            if (table.containsKey(node.data)) {
                previous.next = node.next;

            } else {
                table.put(node.data, true);
                previous = node;
            }

            node = node.next;
        }

    }

    private static void displayNodes(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }

}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private Node first = null;

    void push(int data) {
        Node n = new Node(data);
        n.next = first;
        first = n;
    }

    int pop() {
        Node temp = first;
        first = first.next;
        return temp.data;
    }

    int peek() {
        if (first != null)
            return first.data;
        else
            return -1;
    }

    void displayList() {
        while (first != null) {
            System.out.println(first.data);
            first = first.next;
        }
       
    }

    public static void main(String[] args) {
        StackUsingLinkedList list = new StackUsingLinkedList();
        list.push(1);
        list.push(2);
        list.push(4);
        System.out.println(list.peek());
        list.displayList();

    }
}

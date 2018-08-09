
public class MiddleElementLinkedList {
    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(4);
        node.next.next = new Node(7);
        node.next.next.next = new Node(9);
        node.next.next.next.next = new Node(11);
        node.next.next.next.next.next = new Node(15);
        node.next.next.next.next.next.next = new Node(17);
        findMiddleElement(node);
        findMiddleElementMethod2(node);
    }

    private static void findMiddleElementMethod2(Node node) {
        Node firstPointer = node;
        Node secondPointer = node;

        while (firstPointer != null && secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
        }

        System.out.println(firstPointer.data);
    }

    private static void findMiddleElement(Node node) {
        Node headNode = node;
        int count = 0;
        while (headNode != null) {
            count++;
            headNode = headNode.next;
        }

        int middleCount = count / 2;
        int middleCounter = 0;
        Node middleNode = node;

        while (middleNode != null && middleCounter < middleCount) {
            middleCounter++;
            middleNode = middleNode.next;
        }

        System.out.println(middleNode.data);

    }
}

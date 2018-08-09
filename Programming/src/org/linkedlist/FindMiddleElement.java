package org.linkedlist;

public class FindMiddleElement {
    public static void main(String[] args) {
        ConstructNode nodes = new ConstructNode();
        Node node = nodes.constructNodes();
        findMiddleElement(node);
        findMiddleElementinOnePass(node);

    }

    private static void findMiddleElementinOnePass(Node node) {
        Node current = node;
        Node second = node.next;

        while (current != null && second != null) {
            current = current.next;
            second = second.next.next;
        }

        System.out.println(current.data);

    }

    private static void findMiddleElement(Node node) {
        int count = 0;
        Node current = node;
        while (current != null) {
            count++;
            current = current.next;
        }

        int middleCount = count / 2;

        Node midnode = node;
        int midcount = count / 2;
        int midcounter = 0;

        while (midnode != null && midcounter < midcount) {
            midcounter++;
            midnode = midnode.next;
        }

        System.out.println(midnode.data);
    }

}

package Algorithms.linkedlist.problems;

public class MaximumElements {
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public int maxElement() {
        Node temp = head;
        int max = Integer.MIN_VALUE;
        while (temp != null) {
            if (temp.value > max) {
                max = temp.value;
            }
            temp = temp.next;
        }
        return max;
    }

    public void searchElement(int target) {
        Node result = searchElement(head, target);

        if (result != null) {
            System.out.println("Found: " + result.value);
        } else {
            System.out.println("Not found");
        }
    }

    private Node searchElement(Node head, int target) {
        if (head == null) {
            return null;
        }

        if (head.value == target) {
            return head;
        }

        return searchElement(head.next, target);
    }
}

package Algorithms.linkedlist.problems;

public class SumOfAllElements {
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
            System.out.printf("%d ", temp.value);
            temp = temp.next;
        }
    }

    public int sumOfAllElements() {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.value;
            temp = temp.next;
        }
        return sum;
    }
}

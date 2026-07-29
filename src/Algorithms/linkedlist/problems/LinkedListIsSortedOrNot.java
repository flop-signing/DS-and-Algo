package Algorithms.linkedlist.problems;

public class LinkedListIsSortedOrNot {

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
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf(temp.value + " ");
            temp = temp.next;
        }
    }

    public boolean isSorted() {
        Node temp = head;
        boolean isSorted = true;
        while (temp != null && temp.next != null) {
            if (temp.value > temp.next.value) {
                isSorted = false;
                break;
            }
            temp = temp.next;
        }
        return isSorted;
    }
}

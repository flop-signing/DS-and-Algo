package Algorithms.linkedlist.problems;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

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
        size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public int countNodes() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

}

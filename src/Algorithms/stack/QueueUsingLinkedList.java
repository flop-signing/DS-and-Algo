package Algorithms.stack;

class QueueUsingLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front = null;
    private Node rear = null;
    private int size = 0;

    // Enqueue -> insert at rear
    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue Underflow");
        }
        int val = front.data;
        front = front.next;
        if (front == null) { // queue became empty
            rear = null;
        }
        size--;
        return val;
    }

    public int peek() {
        if (front == null) {
            throw new RuntimeException("Queue is Empty");
        }
        return front.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

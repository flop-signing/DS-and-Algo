package Algorithms.stack;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    private Node front = null, rear = null;
    private int size = 0;

    public void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        size++;
    }

    public int dequeue() {
        if (front == null) throw new RuntimeException("Queue Underflow");
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return val;
    }

    public int peek() {
        if (front == null) throw new RuntimeException("Queue Empty");
        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

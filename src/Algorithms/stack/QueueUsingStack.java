package Algorithms.stack;

import java.util.LinkedList;

class QueueUsingStack {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    private Node top = null;
    private int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack Underflow");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public int peek() {
        if (top == null) throw new RuntimeException("Stack Empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}

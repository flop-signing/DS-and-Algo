package Algorithms.stack;


public class StackWithLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top = null;
    private int size = 0;

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack Underflow");
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is Empty");
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

}

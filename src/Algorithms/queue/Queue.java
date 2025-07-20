package Algorithms.queue;

public class Queue {
    private int[] arr;
    private int front, rear, capacity, size;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value)
    {
        if(isFull()){
            System.out.println("Queue is full");
        }
        arr[++rear] = value;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return arr[front++];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear==capacity-1;
    }


    public static void main(String[] args) {
        Queue queue = new Queue(10);
    }
}

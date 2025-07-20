package Algorithms.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;


    public Stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }
    public boolean isEmpty() {
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push(int value){
        if(!isFull()){
            arr[++top] = value;
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }


    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(22);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

//        System.out.println(Arrays.toString(stack.arr));
//
    }
}

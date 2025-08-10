package Algorithms.recursion;

public class NumbersExample {
    // Write a function that takes in a number and prints it
    // print first 5 numbers: 1,2,3,4,5;

    public static void main(String[] args) {
        printNumber(1);
    }
    static void printNumber(int n) {
        System.out.println(n);
        if(n==10){
            return;
        }
        printNumber(n+1);
    }
}

package Algorithms.linkedlist.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(13);
        list.insertFirst(12);
        list.insertFirst(4);
        list.insertLast(99);

        list.displayReverse();
    }

}

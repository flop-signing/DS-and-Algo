package Algorithms.linkedlist.singlylinkedlist;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertLast(22);

        list.insert(100,3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();
    }
}

package Algorithms.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("List: ");
        list.traverse();  // Output: 10 20 30

        list.delete(20);

        System.out.print("After Deletion: ");
        list.traverse();  // Output: 10 30
    }
}

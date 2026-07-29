package Algorithms.linkedlist.problems;

public class Main {
    public static void main(String[] args) {
        /*SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(6);
        list.insert(2);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insert(4);
        list.display();*/
//        System.out.println(list.countNodes());
/*        SumOfAllElements list = new SumOfAllElements();
        list.insert(1);
        list.insert(3);
        list.insert(6);
        list.insert(2);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insert(4);
        list.display();
        System.out.println("\n");
        System.out.println("Sum of Elements are: " + list.sumOfAllElements());*/


/*        MaximumElements list = new MaximumElements();
        list.insert(1);
        list.insert(3);
        list.insert(6);
        list.insert(2);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insert(4);
        list.display();
        System.out.println("\n");
        System.out.println("Maximum Element is: " + list.maxElement());
        list.searchElement(30);*/

       /* LinkedListIsSortedOrNot list = new LinkedListIsSortedOrNot();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insert(4);
        list.display();
        System.out.println("\n");
        System.out.println(list.isSorted() ? "TRUE" : "FALSE");*/

        RemoveDuplicate list = new RemoveDuplicate();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.display();
        list.reverse();
        System.out.println("\n");
        list.display();


    }
}

package Algorithms.linkedlist.problems;

public class MergeTwoSortedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node head = new Node(-1);
        Node temp = head;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                temp.next = list1;
                list1 = list1.next;

            } else {
                temp.next = list2;
                list2 = list2.next;

            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return head.next;

    }
}

package Algorithms.test;

public class Test {
    private Node head;

    public void insertFirst(int value){

        Node node=new Node(value);
        node.next=head;
        head=node;
    }


    public void insertLast(int value){

        Node node=new Node(value);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }


    private class Node{
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}

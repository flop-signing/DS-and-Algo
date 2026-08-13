package Algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
Algorithm Create_Tree()
Input  : Node values entered by user (level-order), -1 marks "no child"
Output : root — pointer to the root of the constructed binary tree

1.  Declare Node pointers P, T
2.  Declare integer x
3.  Declare a Queue Q

4.  Print "Enter root value"
5.  Read x

6.  Allocate memory for root (root = new Node)
7.  root.data ← x
8.  root.lchild ← NULL
9.  root.rchild ← NULL

10. Enqueue(Q, root)

11. While Q is NOT empty, repeat steps 12–24:

12.     P ← Dequeue(Q)

        // ---- Process Left Child ----
13.     Print "Enter Left child of P.data"
14.     Read x
15.     If x ≠ -1 then:
16.         Allocate memory for T (T = new Node)
17.         T.data ← x
18.         T.lchild ← NULL
19.         T.rchild ← NULL
20.         P.lchild ← T
21.         Enqueue(Q, T)

        // ---- Process Right Child ----
22.     Print "Enter Right child of P.data"
23.     Read x
24.     If x ≠ -1 then:
            Allocate memory for T (T = new Node)
            T.data ← x
            T.lchild ← NULL
            T.rchild ← NULL
            P.rchild ← T
            Enqueue(Q, T)

25. End While
26. Return root
* */


public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;
    static Scanner sc = new Scanner(System.in);

    public static void create() {
        Node p, t;
        int x;
        Queue<Node> q = new LinkedList<>();
        System.out.println("Enter root data");
        x = sc.nextInt();
        root = new Node(x);
        q.add(root);

        while (!q.isEmpty()) {
            p = q.poll();

            // ---- Left child ----
            System.out.print("Enter Left child of " + p.data + " (-1 if none): ");
            x = sc.nextInt();
            if (x == -1) {
                t = new Node(x);
                p.left = t;
                q.add(t);
            }

            // ---- Right Child ----
            System.out.println("Enter Right child of " + x + " (-1 if none): ");
            x = sc.nextInt();
            if (x == -1) {
                t = new Node(x);
                p.right = t;
                q.add(t);
            }

        }
    }

    public static void inorder(Node t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.data + " ");
            inorder(t.right);
        }
    }

    public static void main(String[] args) {
        create();
        System.out.print("\nInorder traversal: ");
        inorder(root);
    }
}

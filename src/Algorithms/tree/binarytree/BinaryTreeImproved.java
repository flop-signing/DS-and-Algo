package Algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeImproved {

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

    public static Node create() {
        Node root;
        Node p, t;
        int x;
        Queue<Node> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root Node: ");
        x = sc.nextInt();
        root = new Node(x);
        q.add(root);

        while (!q.isEmpty()) {
            p = q.poll();
            System.out.println("Enter left child of " + p.data + " (-1 if none): ");
            x = sc.nextInt();
            if (x != -1) {
                t = new Node(x);
                p.left = t;
                q.add(t);
            }
            System.out.println("Enter right child of " + p.data + " (-1 if none): ");
            x = sc.nextInt();
            if (x != -1) {
                t = new Node(x);
                p.right = t;
                q.add(t);
            }
        }
        return root;

    }

    public static void preorderRecursion(Node temp) {
        if (temp != null) {
            System.out.print(temp.data + " ");
            preorderRecursion(temp.left);
            preorderRecursion(temp.right);
        }
    }

    public static void preorder(Node temp) {
        Stack<Node> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                System.out.println(temp.data + " ");
                stack.push(temp);
                temp = temp.left;

            } else {
                temp = stack.pop();
                temp = temp.right;
            }
        }
    }

    public static void levelOrder(Node temp) {
        Queue<Node> queue = new LinkedList<>();
        System.out.println(temp.data);
        queue.add(temp);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

    }

    public static void preorderIterative(Node temp) {
        Stack<Node> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                System.out.print(temp.data + " ");
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args) {

        Node root = create();

        System.out.print("\nPreorder (Recursive): ");
        preorderRecursion(root);

        System.out.print("\nPreorder (Iterative): ");
        preorderIterative(root);

        System.out.println("\nLevel order (Iterative): ");
        levelOrder(root);
    }


} 

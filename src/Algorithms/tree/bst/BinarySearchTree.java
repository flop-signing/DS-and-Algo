package Algorithms.tree.bst;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node root = null;

    void insert(int key) {

        if (root == null) {
            root = new Node(key);
            return;
        }

        Node t = root;
        Node r = null;

        while (t != null) {
            r = t;
            if (key < t.data) {
                t = t.left;
            } else if (key > t.data) {
                t = t.right;
            } else {
                return;
            }
        }

        Node p = new Node(key);

        if (key < r.data) {
            r.left = p;
        } else {
            r.right = p;
        }
    }

    static void inorder(Node t) {
        if (t != null) {
            inorder(t.left);
            System.out.println(t.data);
            inorder(t.right);
        }
    }
}
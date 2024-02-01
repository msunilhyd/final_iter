package org.example.tree;

public class MaxHeight {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node left1 = new Node(2);
        Node right1 = new Node(3);
        Node left2 = new Node(1);
        Node right2 = new Node(1);
        Node right3 = new Node(1);
        Node right4 = new Node(1);
        Node right5 = new Node(1);
        Node right6 = new Node(1);

        head.left = left1;
        left1.left = left2;
        head.right = right1;
        right1.right = right2;
        right2.right = right3;
        right3.right = right4;
        right4.right = right5;
        right5.left = right6;
        System.out.println(find(head));
    }

    public static int find(Node head) {
        if (head == null)
            return 0;
        int leftHeight = 1 + find(head.left);
        int rightHeight = 1 + find(head.right);

        return Math.max(leftHeight, rightHeight);
    }
}

package org.example.list;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        n5.next = n6;
        n4.next = n5;
        n6.next = n7;
        n7.next = n8;
        printList(n1);
        Node temp = remove(n1, 2);
        printList(temp);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node remove(Node head, int n) {
        Node dummy = new Node(1);
        dummy.next = head;

        Node front = head;
        Node back = head;
        for (int i=0; i<n; i++) {
            front = front.next;
        }
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return dummy.next;
    }
}

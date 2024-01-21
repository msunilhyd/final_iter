package org.example.list;

public class Merge2SortedLists {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node n5 = new Node(2);
        Node n6 = new Node(4);
        Node n7 = new Node(5);
        Node n8 = new Node(6);
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        Node temp = merge(n1, n5);
        printList(temp);
    }

    public static Node merge(Node h1, Node h2) {
        Node head = new Node(1);
        Node dummy = head;
        while(h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                dummy.next = h1;
                h1 = h1.next;
            } else {
                dummy.next = h2;
                h2 = h2.next;
            }
            dummy = dummy.next;
        }

        while (h1 != null) {
            dummy.next = h1;
            h1 = h1.next;
            dummy = dummy.next;
        }
        while (h2 != null) {
            dummy.next = h2;
            h2 = h2.next;
            dummy = dummy.next;
        }
        return head.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

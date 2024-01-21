package org.example.list;

public class DetectCycleInList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;
        System.out.println(findCycle(n1));
    }

    public static int findCycle(Node head) {
        Node t1 = head;
        Node t2 = head;
        Node prev = head;
        while (t2.next != null) {
            prev = t1;
            t1 = t1.next;
            t2 = t2.next.next;
            System.out.println("t1 = " + t1.data + " t2 = " + t2.data);
            if (t1 == t2) {
                return prev.data;
            }
        }
        return 0;
    }
}

package org.example.list;

import java.util.PriorityQueue;

public class MergeKSortedLists {

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

        Node temp = merge(new Node[]{n1, n5});
        printList(temp);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node merge(Node[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (Node list : lists) {
            while (list != null) {
                pq.add(list.data);
                list = list.next;
            }
        }
        System.out.println(pq);
        System.out.println("====");
        Node dummy = new Node(1);
        Node merge = dummy;
        while (!pq.isEmpty()) {
            System.out.println(pq);
            Node newNode = new Node(pq.remove());
            merge.next = newNode;
            merge = merge.next;
        }
        return dummy.next;
    }
}

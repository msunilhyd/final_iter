package org.example.list;

public class ReOrderList {

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
        reorderList(n1);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void reorderList(Node head) {
        if(head == null)
            return;

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);

        Node curr = slow;
        Node prev = null;
        Node temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        printList(prev);

        Node dummy = new Node(1);
        dummy.next = head;
        Node merge = dummy;

        while (prev.next != null && head != null) {
            System.out.println("Hello");
            Node temp1 = head.next;
            head.next = prev;
            head = temp1;

            Node temp2 = prev.next;
            prev.next = temp1;
            prev = temp2;
        }
        printList(merge.next);
    }
}

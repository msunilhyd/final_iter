package org.example.list;

public class ReverseListInSizes3 {
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
        Node dummy = new Node(1);
        dummy.next = n1;
        Node merge = dummy;
        Node test = reverse(n1);
        printList(test);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {
        if (head == null)
            return null;
        int i=0;
        Node curr = head;
        Node prev = null;
        Node temp = null;
        while(i<3 && curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        if (temp != null)
            head.next = reverse(temp);
        return prev;
    }
}

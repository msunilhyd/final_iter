package com.sunil.redis.ds;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

        ListNode m3 = new ListNode(8);
        ListNode m4 = new ListNode(9);
        ListNode m5 = new ListNode(10);
        ListNode m6 = new ListNode(11);
        ListNode m7 = new ListNode(12);
        ListNode m8 = new ListNode(13);

        m3.next = m4;
        m4.next = m5;
        m5.next = m6;
        m6.next = m7;
        m7.next = m8;
        m8.next = null;

        ListNode node = remove(m3, 6);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode remove(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode first = dummy;
        ListNode back = dummy;

        for (int i=0; i<=n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            back = back.next;
        }
        back.next = back.next.next;

        return dummy.next;
    }
}

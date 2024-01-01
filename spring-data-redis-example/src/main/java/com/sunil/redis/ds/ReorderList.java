package com.sunil.redis.ds;

public class ReorderList {


    public static void main(String[] args) {

        ListNode k3 = new ListNode(3);
        ListNode k4 = new ListNode(9);
        ListNode k5 = new ListNode(4);
        ListNode k6 = new ListNode(2);
        ListNode k7 = new ListNode(1);
        ListNode k8 = new ListNode(7);

        k3.next = k4;
        k4.next = k5;
        k5.next = k6;
        k6.next = k7;
        k7.next = k8;
        k8.next = null;
        ListNode node = reorderList(k3);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode reorderList(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode temp;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head;
        ListNode second = prev;

        while(second.next != null) {
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }

        return head;
    }
}

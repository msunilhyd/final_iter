package com.sunil.redis.ds;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;


        ListNode k3 = new ListNode(3);
        ListNode k4 = new ListNode(4);
        ListNode k5 = new ListNode(5);
        ListNode k6 = new ListNode(6);

        k3.next = k4;
        k4.next = k5;
        k5.next = k6;
        k6.next = null;

        ListNode node = mergeLists(l1, k3);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode merge = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        if (list1 != null) {
            merge.next = list1;
        }
        if (list1 != null) {
            merge.next = list2;
        }
        return dummy.next;
    }
}

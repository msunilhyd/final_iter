package com.sunil.redis.ds;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode k3 = new ListNode(3);
        ListNode k4 = new ListNode(4);
        ListNode k5 = new ListNode(5);
        ListNode k6 = new ListNode(6);

        k3.next = k4;
        k4.next = k5;
        k5.next = k6;
        k6.next = null;

        ListNode m3 = new ListNode(8);
        ListNode m4 = new ListNode(9);
        ListNode m5 = new ListNode(10);
        ListNode m6 = new ListNode(11);

        m3.next = m4;
        m4.next = m5;
        m5.next = m6;
        m6.next = null;
        ListNode[] arr = {l1, m3, k3};
        ListNode node = mergeKlists(arr);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode mergeKlists(ListNode[] lists) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode list: lists) {
            while (list != null) {
                minHeap.add(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode();
        ListNode merge = dummy;

        while(!minHeap.isEmpty()) {
            merge.next = new ListNode(minHeap.remove());
            merge = merge.next;
        }
        return dummy.next;
    }
}

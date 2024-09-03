package ru.developer.leetcode.medium;

import ru.developer.leetcode.medium.swap_nodes_pairs_24.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without
 * modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Example
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 */
public class SwapNodesInPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode second = head.next;
        ListNode pr = swapPairs(second.next);
        second.next = head;
        head.next = pr;
        return second;
    }
}

package com.dexhacker.leetcode.delete_node_in_a_linked_list;

import com.dexhacker.leetcode.structures.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}

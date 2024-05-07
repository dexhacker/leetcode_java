package com.dexhacker.leetcode.double_a_number_represented_as_a_linked_list;

import com.dexhacker.leetcode.structures.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ListNode doubleIt(ListNode head) {
        Map<ListNode, ListNode> prev = new HashMap<>();
        ListNode last = null;
        ListNode current = head;
        while (current != null) {
            prev.put(current.next, current);
            if (current.next == null) last = current;
            current = current.next;
        }

        int number = 0;
        while (last != null) {
            number = last.val * 2 + number;
            last.val = number % 10;
            number /= 10;
            last = prev.get(last);
        }

        if (number == 0) return head;

        return new ListNode(number, head);
    }
}

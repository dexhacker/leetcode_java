package com.dexhacker.leetcode.remove_nodes_from_linked_list;

import com.dexhacker.leetcode.structures.ListNode;

import java.util.ArrayList;

public class Solution {
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            if (list.isEmpty()) {
                list.add(head.val);
            } else {
                if (list.get(list.size() - 1) < head.val) {
                    list.remove(list.size() - 1);
                    continue;
                }
                list.add(head.val);
            }
            head = head.next;
        }

        ListNode next = null;
        ListNode answer = null;
        for (Integer integer : list) {
            ListNode current = new ListNode(integer);
            if (answer == null) answer = current;
            if (next != null) next.next = current;
            next = current;
        }

        return answer;
    }
}

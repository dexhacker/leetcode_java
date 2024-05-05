package com.dexhacker.leetcode.delete_node_in_a_linked_list;

import com.dexhacker.leetcode.structures.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testDeleteNode() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        solution.deleteNode(node2);

        assertEquals(node1.val, 4);
        assertEquals(node1.next.val, 1);
        assertEquals(node1.next.next.val, 9);
    }

    @Test
    public void testDeleteNode2() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        solution.deleteNode(node3);

        assertEquals(node1.val, 4);
        assertEquals(node1.next.val, 5);
        assertEquals(node1.next.next.val, 9);
    }
}

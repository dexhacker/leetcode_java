package com.dexhacker.leetcode.double_a_number_represented_as_a_linked_list;

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
    public void testDoubleIt() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;

        ListNode result = solution.doubleIt(node1);

        assertEquals(result.val, 3);
        assertEquals(result.next.val, 7);
        assertEquals(result.next.next.val, 8);
    }

    @Test
    public void testDoubleIt2() {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;

        ListNode result = solution.doubleIt(node1);

        assertEquals(result.val, 1);
        assertEquals(result.next.val, 9);
        assertEquals(result.next.next.val, 9);
        assertEquals(result.next.next.next.val, 8);
    }
}

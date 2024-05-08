package com.dexhacker.leetcode.relative_ranks;

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
    public void testFindRelativeRanks() {
        int[] score = new int[]{5, 4, 3, 2, 1};
        String[] result = solution.findRelativeRanks(score);
        String[] expected = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], expected[i]);
        }
    }

    @Test
    public void testFindRelativeRanks2() {
        int[] score = new int[]{10, 3, 8, 9, 4};
        String[] result = solution.findRelativeRanks(score);
        String[] expected = new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], expected[i]);
        }
    }

    @Test
    public void testFindRelativeRanks3() {
        int[] score = new int[]{1, 5, 4, 3, 2, 6};
        String[] result = solution.findRelativeRanks(score);
        String[] expected = new String[]{"6", "Silver Medal", "Bronze Medal", "4", "5", "Gold Medal"};
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], expected[i]);
        }
    }
}

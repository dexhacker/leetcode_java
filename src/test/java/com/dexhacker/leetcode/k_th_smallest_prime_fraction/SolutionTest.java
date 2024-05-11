package com.dexhacker.leetcode.k_th_smallest_prime_fraction;

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
    public void testKthSmallestPrimeFraction() {
        int[] arr = new int[]{1, 2, 3, 5};
        int[] expected = new int[]{2, 5};
        int [] result = solution.kthSmallestPrimeFraction(arr, 3);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testKthSmallestPrimeFraction2() {
        int[] arr = new int[]{1, 7};
        int[] expected = new int[]{1, 7};
        int [] result = solution.kthSmallestPrimeFraction(arr, 1);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}

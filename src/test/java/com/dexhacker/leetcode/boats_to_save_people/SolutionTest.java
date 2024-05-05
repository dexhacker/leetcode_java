package com.dexhacker.leetcode.boats_to_save_people;

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
    public void testNumRescueBoats() {
        int result = solution.numRescueBoats(new int[]{1, 2}, 3);
        assertEquals(result, 1);
    }

    @Test
    public void testNumRescueBoats2() {
        int result = solution.numRescueBoats(new int[]{3, 2, 2, 1}, 3);
        assertEquals(result, 3);
    }

    @Test
    public void testNumRescueBoats3() {
        int result = solution.numRescueBoats(new int[]{3, 5, 3, 4}, 5);
        assertEquals(result, 4);
    }

    @Test
    public void testNumRescueBoats4() {
        int result = solution.numRescueBoats(new int[]{3, 2, 3, 2, 2}, 6);
        assertEquals(result, 3);
    }
}

package com.dexhacker.leetcode.k_th_smallest_prime_fraction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Item(double sum, int i, int j) {}

public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                items.add(new Item((double)arr[i] / (double)arr[j], i, j));
            }
        }

        Comparator<Item> comparator = Comparator.comparing(Item::sum);
        items.sort(comparator);

        Item item = items.get(k - 1);

        return new int[]{arr[item.i()], arr[item.j()]};
    }
}

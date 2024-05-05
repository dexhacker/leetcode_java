package com.dexhacker.leetcode.boats_to_save_people;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int l = 0;
        int r = people.length - 1;
        int sum = 0;
        int count = 0;
        while (l <= r) {
            if (count < 2 && sum + people[r] <= limit) {
                sum += people[r];
                count++;
                r--;
                continue;
            }

            if (count < 2 && sum + people[l] <= limit) {
                sum += people[l];
                count++;
                l++;
                continue;
            }

            answer++;
            sum = 0;
            count = 0;
        }

        return (sum == 0) ? answer : answer + 1;
    }
}

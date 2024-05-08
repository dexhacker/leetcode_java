package com.dexhacker.leetcode.relative_ranks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
        for (int scoreItem : score) m.put(scoreItem, -1);
        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) m.put(score[i], score.length - i);
        String[] answer = new String[score.length];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                answer[count] = "Gold Medal";
            } else if (entry.getValue() == 2) {
                answer[count] = "Silver Medal";
            } else if (entry.getValue() == 3) {
                answer[count] = "Bronze Medal";
            } else {
                answer[count] = entry.getValue().toString();
            }
            count++;
        }
        return answer;
    }
}

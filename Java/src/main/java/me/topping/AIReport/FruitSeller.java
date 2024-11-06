package me.topping.AIReport;

import java.util.Arrays;
import java.util.Collections;

class Solution1 {
    int solution(int k, int m, int[] score) {
        int answer = 0;

        Integer[] result = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());

        for (int i = 0; i <= result.length - m; i += m) {
            int min = result[i + m - 1];
            answer += min * m;
        }
        System.out.println(answer);
        return answer;
    }
}

public class FruitSeller {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }
}

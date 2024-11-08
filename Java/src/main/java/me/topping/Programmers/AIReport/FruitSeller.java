package me.topping.Programmers.AIReport;

import java.util.Arrays;
import java.util.Collections;

class Solution1 {
    int solution(int k, int m, int[] score) {
        int answer = 0;

        // Solution Code
//        Arrays.sort(score);
//        for (int i = score.length; i >= m; i -= m) {
//            answer += score[i - m] * m;
//        }

        // Solution Code2
//        int[] sc2 = new int[k + 1];
//        for (int i = 0; i < score.length; i++) sc2[score[i]]++;
//
//        int sum = 0, mod = 0;
//        for (int i = k; i > 0; i--) {
//            sc2[i] = sc2[i] + mod;
//            sum += sc2[i] / m * m * i;
//            mod = sc2[i] % m;
//        }
//
//        return sum;

        Integer[] result = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());

        for (int i = 0; i <= result.length - m; i += m) {
            int min = result[i + m - 1];
            answer += min * m;
        }
        //System.out.println(answer);
        return answer;
    }
}

public class FruitSeller {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }
}

package Java.Programmers.Year2025.Mon02.Day0218;

// Title : 특별한 이차원 배열1
// Q. 정수 n이 주어지면 n x n 크기의 이차원 배열 arr를 return 하는 solution 함수

import java.util.Arrays;

class Solution5 {
    int[][] solution (int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}

public class Special2DimensionArray1 {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(Arrays.deepToString(s5.solution(3)));
        System.out.println(Arrays.deepToString(s5.solution(6)));
        System.out.println(Arrays.deepToString(s5.solution(1)));
    }
}

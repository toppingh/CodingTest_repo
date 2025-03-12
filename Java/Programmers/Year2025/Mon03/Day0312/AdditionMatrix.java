package Java.Programmers.Year2025.Mon03.Day0312;

// Title : 행렬의 덧셈
// Q. 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과
// Q. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 solution 함수

import java.util.Arrays;

class Solution2 {
    int[][] solution (int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

public class AdditionMatrix {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.deepToString(s2.solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(s2.solution(new int[][] {{1}, {2}}, new int[][] {{3}, {4}})));
    }
}

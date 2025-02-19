package Java.Programmers.Year2025.Mon02.Day0219;

// Title : 정수를 나선형으로 배치하기
// Q. n x n 배열에 1부터 n^2까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int top = 0, left = 0, bottom = n - 1, right = n - 1;

        while (num <= n * n) {
            // 왼쪽에서 오른쪽으로 값 채우기
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++; // 위쪽 채운 후 상단 경계로 이동

            // 위쪽에서 아래쪽으로 값 채우기
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--; // 오른쪽 채운 후 우측 경계로 이동

            // 오른쪽에서 왼쪽으로 값 채우기
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = num++;
                }
                bottom--; // 아래쪽 채운 후 하단 경계로 이동
            }

            // 아래쪽에서 위쪽으로 값 채우기
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = num++;
                }
                left++; // 왼쪽 채운 후 좌측 경계로 이동
            }
        }
        return answer;
    }
}

public class PlaceIntToSpiral {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.deepToString(s1.solution(4)));
        System.out.println(Arrays.deepToString(s1.solution(5)));
    }
}

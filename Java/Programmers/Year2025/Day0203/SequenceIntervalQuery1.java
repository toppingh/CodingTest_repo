package Java.Programmers.Year2025.Day0203;

// Title : 수열과 구간 쿼리1
// Q. 정수 배열 arr와 2차원 정수 배열 queries가 주어진다. queries의 원소는 각각 하나의 query를 나타내며, [s, e]꼴이다.
// Q. 각 qeuery마다 순서대로 s <= i <= e인 모든 i에 대해 arr[i]에 1을 더한다.
// Q. 위 규칙에 따라 queries를 처리한 후의 arr를 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i] += 1;
            }
        }
        return arr;
    }
}

public class SequenceIntervalQuery1 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 1}, {1, 2}, {2, 3}})));
    }
}

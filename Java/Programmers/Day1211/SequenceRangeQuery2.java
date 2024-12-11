package Java.Programmers.Day1211;

// Title : 수열과 구간 쿼리2
// Q. 정수 배열 arr와 2차원 정수 배열 queries가 주어진다. queries의 원소는 각각 하느이 query이며, [s, e, k]꼴이다.
// Q. 각 query마다 순서대로 s <= i <= e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾는다.
// Q. 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수 (특정 쿼리의 답이 존재하지 않으면 -1 저장)

import java.util.Arrays;

class Solution5 {
    int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) min = Math.min(min, arr[j]);
                answer[i] = min == Integer.MAX_VALUE ? -1 : min;
            }
        }
        return answer;
    }
}

public class SequenceRangeQuery2 {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(Arrays.toString(s5.solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }
}

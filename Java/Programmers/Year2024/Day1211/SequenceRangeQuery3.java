package Java.Programmers.Year2024.Day1211;

// Title : 수열과 구간 쿼리 3
// Q. 정수 배열 arr와 2차원 정수 배열 queries가 주어지고 queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴이다.
// Q. 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꾼다.
// Q. 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수

class Solution4 {
    int[] solution (int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];

            arr[idx1] ^= arr[idx2];
            arr[idx2] ^= arr[idx1];
            arr[idx1] ^= arr[idx2];
        }
        return arr;
    }
}

public class SequenceRangeQuery3 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 3}, {1, 2}, {1, 4}}));
    }
}

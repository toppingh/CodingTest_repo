package Java.Programmers.Year2024.Day1217;

// Title : 수열과 구간 쿼리4
// Q. 정수 배열 arr와 2차원 정수 배열 queries가 주어질 때, queries의 원소는 각각 하나의 query를 나타내며, [s, e, k]꼴이다.
// Q. 각 query마다 순서대로 s <= i <= e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더한다.
// Q. 위 규칙에 따라 queries를 처리한 이후의 arr를 return하는 solution 함수

class Solution1 {
    int[] solution (int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (k != 0 && i % k == 0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}

public class SequenceIntervalQuery4 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}}));
    }
}

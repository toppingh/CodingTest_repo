package Java.Programmers.Year2025.Mon02.Day0219;

// Title : 정사각형으로 만들기
// Q. arr의 열과 행의수가 같도록 각 열이나 행의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수

import java.util.Arrays;

class Solution3 {
    int[][] solution (int[][] arr) {
        int size = Math.max(arr.length, arr[0].length);
//        System.out.println(size);
        int[][] answer = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
        return answer;
    }
}

public class MakeItSquare {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.deepToString(s3.solution(new int[][] {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}})));
        System.out.println(Arrays.deepToString(s3.solution(new int[][] {{57, 192, 534, 2}, {9, 345, 192, 999}})));
        System.out.println(Arrays.deepToString(s3.solution(new int[][] {{1, 2}, {3, 4}})));
    }
}

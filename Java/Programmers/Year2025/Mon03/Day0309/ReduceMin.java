package Java.Programmers.Year2025.Mon03.Day0309;

// Title : 제일 작은 수 제거하기
// Q. 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열을 return 하는 solution 함수
// Q. 빈 배열일 경우 -1을 채워 return

import java.util.Arrays;

class Solution3 {
    int[] solution (int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        int[] answer = new int[arr.length - 1];

        int tmp = arr[0];
        for (int i : arr) {
            tmp = Math.min(tmp, i);
        }

        int idx = 0;
        for (int i : arr) {
            if (i != tmp) answer[idx++] = i;
        }

        return answer;
    }
}

public class ReduceMin {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();

        System.out.println(Arrays.toString(s3.solution(new int[] {4, 3, 2, 1})));
        System.out.println(Arrays.toString(s3.solution(new int[] {10})));
    }
}

package Java.Programmers.Year2025.Mon02.Day0218;

// Title : 조건에 맞게 수열 변환하기3
// Q. k가 홀수면 arr의 모든 원소에 k를 곱하고, 짝수면 arr의 모든 원소에 k를 더해 return 하는 solution 함수

import java.util.Arrays;

class Solution3 {
    int[] solution (int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k % 2 == 1 ? arr[i] * k : arr[i] + k;
        }
        return arr;
    }
}

public class ConvertSequenceToCondition3 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new int[] {1, 2, 3, 100, 99, 98}, 3)));
        System.out.println(Arrays.toString(s3.solution(new int[] {1, 2, 3, 100, 99, 98}, 2)));
    }
}

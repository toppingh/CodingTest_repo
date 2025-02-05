package Java.Programmers.Year2025.Mon02.Day0204;

// Title : 조건에 맞게 수열 변환하기1
// Q. 정수 배열 arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱한다.
// Q. 그 결과인 정수 배열을 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] >= 50 && arr[i] % 2 == 0) ? arr[i] / 2 : (arr[i] < 50 && arr[i] % 2 != 0) ? arr[i] * 2 : arr[i];
        }
        return arr;
    }
}

public class SequenceConversion1 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 2, 3, 100, 99, 98})));
    }
}

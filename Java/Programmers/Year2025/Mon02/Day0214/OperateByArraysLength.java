package Java.Programmers.Year2025.Mon02.Day0214;

// Title : 배열의 길이에 따라 다른 연산하기
// Q. 정수 배열 arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수

import java.util.Arrays;

class Solution4 {
    int[] solution (int[] arr, int n) {
        int idx = arr.length % 2 == 0 ? 1 : 0;

        for (int i = idx; i < arr.length; i += 2) {
            arr[i] += n;
        }

        return arr;
    }
}

public class OperateByArraysLength {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(new int[] {49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(s4.solution(new int[] {444, 555, 666, 777}, 100)));
    }
}

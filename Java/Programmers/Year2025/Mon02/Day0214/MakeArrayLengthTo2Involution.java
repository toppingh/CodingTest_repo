package Java.Programmers.Year2025.Mon02.Day0214;

// Title : 배열의 길이를 2의 거듭제곱으로 만들기
// Q. 정수 배열 arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려 한다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution

import java.util.Arrays;

class Solution1 {
    int[] solution (int[] arr) {
        int i = 1;

        while (i < arr.length) {
            i *= 2;

        }

        return Arrays.copyOf(arr, i);
    }
}

public class MakeArrayLengthTo2Involution {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(s1.solution(new int[] {58, 172, 746, 89})));
    }
}

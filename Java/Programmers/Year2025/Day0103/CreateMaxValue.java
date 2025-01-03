package Java.Programmers.Year2025.Day0103;

// Title : 최댓값 만들기 (2)
// Q. 정수 배열 numbers가 매개변수로 주어질 때 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하는 solution 함수

import java.util.Arrays;

class Solution2 {
    int solution (int[] numbers) {
        Arrays.sort(numbers);

        return Math.max(numbers[numbers.length - 1] * numbers[numbers.length - 2], numbers[0] * numbers[1]);
    }
}

public class CreateMaxValue {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {1, 2, -3, 4, -5}));
        System.out.println(s2.solution(new int[] {0, -31, 24, 10, 1, 9}));
        System.out.println(s2.solution(new int[] {10, 20, 30, 5, 5, 20, 5}));
    }
}

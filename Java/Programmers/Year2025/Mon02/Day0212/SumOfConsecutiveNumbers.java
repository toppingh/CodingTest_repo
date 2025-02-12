package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 연속된 수의 합
// Q. 연속된 수 num개를 더한 값이 total이 될 때 정수 배열을 오름차순으로 담아 return 하는 solution 함소

import java.util.Arrays;

class Solution8 {
    int[] solution (int num, int total) {
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = ((total - num * (num - 1) / 2) / num )+ i;
        }

        return answer;
    }
}

public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        Solution8 s8 = new Solution8();
        System.out.println(Arrays.toString(s8.solution(3, 12)));
        System.out.println(Arrays.toString(s8.solution(5, 15)));
        System.out.println(Arrays.toString(s8.solution(4, 14)));
        System.out.println(Arrays.toString(s8.solution(5, 5)));
    }
}

package Java.Programmers.Year2025.Day0115;

// Title : 배열 만들기1
// Q. 정수 n과 k가 주어졌을때, 1이상 n이하의 정수 중 k의 배수를 오름차순으로 저장한 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    int[] solution (int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }
        return answer;
    }
}

public class CreateArray1 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(10, 3)));
        System.out.println(Arrays.toString(s2.solution(15, 5)));
    }
}

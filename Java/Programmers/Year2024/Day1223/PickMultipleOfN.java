package Java.Programmers.Year2024.Day1223;

// Title : n의 배수 고르기
// Q. 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    int[] solution (int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for(int i : numlist) {
            if (i % n == 0) list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

public class PickMultipleOfN {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(s2.solution(5, new int[] {1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(s2.solution(12, new int[] {2, 100, 120, 600, 12, 12})));
    }
}

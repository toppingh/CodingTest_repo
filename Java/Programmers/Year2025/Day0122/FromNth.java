package Java.Programmers.Year2025.Day0122;

// Title : n번째 원소부터
// Q. 정수 리스트 num_list와 정수 n이 주어질 때, n번째 원소부터 마지막 원소까지 모든 원소를 담은 리스트 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int idx = 0;

        for (int i = n - 1; i < num_list.length; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        return answer;
    }
}

public class FromNth {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[]{2, 1, 6}, 3)));
        System.out.println(Arrays.toString(s1.solution(new int[]{5, 2, 1, 7, 5}, 2)));
    }
}

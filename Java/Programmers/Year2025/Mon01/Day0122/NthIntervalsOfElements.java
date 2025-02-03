package Java.Programmers.Year2025.Mon01.Day0122;

// Title : n개 간격의 원소들
// Q. 정수 리스트 num_list의 첫 번째 원소부터 마지막 원소까지 정수 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return 하는 solution 함수

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

class Solution5 {
    int[] solution (int[] num_list, int n) {
        int[] answer = new int[(num_list.length + n - 1) / n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}

public class NthIntervalsOfElements {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(Arrays.toString(s5.solution(new int[] {4, 2, 6, 1, 7, 6}, 2)));
        System.out.println(Arrays.toString(s5.solution(new int[] {4, 2, 6, 1, 7, 6}, 4)));
    }
}

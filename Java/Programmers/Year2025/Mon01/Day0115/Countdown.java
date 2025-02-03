package Java.Programmers.Year2025.Mon01.Day0115;

// Title : 카운트다운
// Q. 정수 start_num와 end_num이 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하는 solution 함수

import java.util.Arrays;

class Solution4 {
    int[] solution (int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }
}

public class Countdown {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(10, 3)));
    }
}

package Java.Programmers.Year2025.Mon03.Day0302;

// Title : [PCCE 기출문제] 6번 / 가채점
// Q. 성적을 문의하는 학생들의 번호가 담긴 배열 numbers와 가채점한 성적을 문의하려는 학생 순서대로 담긴 정수 리스트 our_score
// Q. 실제 성적이 번호 순서대로 담긴 정수 리스트 score_list가 주어진다.
// Q. 가채점한 점수가 실제 성적과 동일하면 Same, 다르면 Different를 순서대로 리스트에 담아 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    String[] solution (int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }
        return answer;
    }
}

public class TentativeScore {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1}, new int[] {100}, new int[] {100, 80, 90, 84, 20})));
        System.out.println(Arrays.toString(s1.solution(new int[] {3, 4}, new int[] {85, 93}, new int[] {85, 92, 38, 93, 48, 85, 92, 56})));
    }
}

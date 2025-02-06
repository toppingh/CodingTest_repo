package Java.Programmers.Year2025.Mon02.Day0206;

// Title : 등수 매기기
// Q. 영어와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 두 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하는 solution 함수

import java.util.Arrays;

class Solution2 {
    int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] avg = new float[score.length];

        for (int i = 0; i < score.length; i++) {
            avg[i] = (float) (score[i][0] + score[i][1]) / 2;
        }

        for (int i = 0; i < avg.length; i++) {
            int idx = 1;
            for (int j = 0; j < avg.length; j++) {
                if (avg[i] < avg[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }

        return answer;
    }
}

public class Ranking {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[][] {{80, 70} ,{90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(s2.solution(new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
    }
}

package Java.Programmers.Year2025.Day0328;

// Title : 모의고사
// Q. 1번 문제부터 마지막 문제까지의 정답이 순서대로 들어있는 배열 answer가 주어질 때, 가장 많은 문제를 맞힌 사람은 누구인지 배열에 담아 return 하는 solution 함수
// Q. 1번 수포자는 1, 2, 3, 4, 5, 1 ... 2번 수포자는 2, 1, 2, 3, 2, 4, 2, 5, 2, 1 ... 3번 수포자는 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3 ... 방식으로 찍는다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    int[] solution (int[] answers) {
        int[] cnt = new int[3];
        int[][] ways = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (answers[i] == ways[j][i % ways[j].length]) cnt[j]++;
            }
        }

        int[] answer = new int[3];
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == Math.max(cnt[0], Math.max(cnt[1], cnt[2]))) {
                answer[idx++] = i + 1;
            }
        }

        return Arrays.copyOf(answer, idx);
    }
}

public class MockTest {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 3, 2, 4, 2})));
    }
}

package Java.Programmers.Year2025.Mon02.Day0215;

// Title : 전국 대회 선발 고사
// Q. 각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어딘다.
// Q. 전국 대회에 선발된 학생번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 x a + 100 x b + c를 return 하는 solution 함수

import java.util.*;

class Solution2 {
    int solution (int[] rank, boolean[] attendance) {
        // 우선순위 큐 (등수가 낮을수록 우선순위 높음)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> rank[i]));

        // 대회 참석 가능 학생만 큐에 추가
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) pq.offer(i);
        }

        return 10000 * pq.poll() + 100 * pq.poll() + pq.poll();
    }
}

public class NationalExam {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false ,false}));
        System.out.println(s2.solution(new int[] {1, 2, 3}, new boolean[] {true, true, true}));
        System.out.println(s2.solution(new int[] {6, 1, 5, 2, 3, 4}, new boolean[] {true, false, true, false, false, true}));

    }
}

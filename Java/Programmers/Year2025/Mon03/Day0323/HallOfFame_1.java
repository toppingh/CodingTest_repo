package Java.Programmers.Year2025.Mon03.Day0323;

// Title : 명예의 전당(1)
// Q. 초기에 k일까지는 모든 가수의 점수가 명예의 전당에 오른다. k일 다음부터는 기존 명예의 전당 목록의 k번째 순위의 가수 점수보다 높으면 해당 가수의 점수가 오르게 되고 기존 k번째 순위의 점수는 내려오게된다.
// Q. 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수 score가 주어질 때, 매일 발표된 명예의 전당의 최하위 점수를 return 하는 solution 함수

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution2 {
    int[] solution (int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]); // 큐에 각 점수 추가 - 자동 오름차순 정렬 (최소값은 항상 맨 앞에 위치)

            // k개 초과 시 최소값 제거
            if (pq.size() > k) {
                pq.poll();  // poll() : 큐에서 최소값 제거
            }

            answer[i] = pq.peek(); // k개의 점수 중 최소값 저장
        }

        return answer;
    }
}

public class HallOfFame_1 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(s2.solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
}

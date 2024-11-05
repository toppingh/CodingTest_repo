package me.topping.AIReport;

class Solution {
    public int[] solution(int n, int s) {
        if (s / n == 0) {
            return new int[]{-1};
        }

        // 기본 값 계산
        int value = s / n;
        int remainder = s % n;

        // 배열 초기화
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = value;
        }

        // 나머지 값을 추가해 원소에 +1씩 분배
        for (int i = 0; i < remainder; i++) {
            answer[n - 1 - i] += 1;
        }
        return answer;
    }
}

public class BestSet {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(2, 7);

    }
}

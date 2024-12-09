package me.topping.Programmers.AIReport;

// Solution Code
import java.util.Arrays;

class BestSet2 {
    public int[] BestSet(int n, int s) {
        int[] answer = null;
        if (n > s) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[n];
            int i = 0;
            while(s > 0) {
                answer[(i % n)]++;
                i++;
                s--;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

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
        BestSet2 bs = new BestSet2();

        s.solution(2, 7);
        bs.BestSet(3, 10);

    }
}

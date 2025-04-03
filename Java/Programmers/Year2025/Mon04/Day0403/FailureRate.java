package Java.Programmers.Year2025.Mon04.Day0403;

// Title : 실패율
// Q. 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
// Q. 전체 스테이지 개수 N, 게임 유저가 멈춰있는 스테이지 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 낼미차순으로 스테이지의 번호가 담겨있는 배열을 return 하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    int[] solution (int N, int[] stages) {
        int[] cnt = new int[N + 2];

        for (int i : stages) {
            if (i <= N) cnt[i]++;
        }

        List<double[]> failure = new ArrayList<>();
        int remain = stages.length;

        for (int i = 1; i <= N; i++) {
            if (remain == 0) {
                failure.add(new double[] {i, 0});
            } else {
                double failRate = (double) cnt[i] / remain;
                failure.add(new double[] {i, failRate});
                remain -= cnt[i];
            }
        }

        failure.sort((a, b) -> Double.compare(b[1], a[1]) != 0 ? Double.compare(b[1], a[1]) : Double.compare(a[0], b[0]));

        int[] answer = new int[N];
        for (int i = 0; i < failure.size(); i++) {
            answer[i] = (int) failure.get(i)[0];
        }

        return answer;
    }
}

public class FailureRate {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(s1.solution(4, new int[] {4, 4, 4, 4, 4})));
    }
}

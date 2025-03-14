package Java.Programmers.Year2025.Mon03.Day0314;

// Title : 예산
// Q. 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int solution (int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        int cnt = 0;
        for (int i : d) {
            answer += i;

            if (answer >= budget) {
                break;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}

public class Budget {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {1, 3, 2, 5, 4}, 9));
    }
}

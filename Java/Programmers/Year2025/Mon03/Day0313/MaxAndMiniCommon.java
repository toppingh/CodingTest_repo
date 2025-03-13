package Java.Programmers.Year2025.Mon03.Day0313;

// Title : 최대공약수와 최소공배수
// Q. 두 수를 입력받아 두 수의 최대 공약수와 최소 공배수를 return 하는 solution 함수
// Q. 배열의 맨 앞에 최대 공약수, 그 다음에 최소공배수를 넣어 return

import java.util.Arrays;

class Solution2 {
    int[] solution (int n, int m) {
        int[] answer = new int[] {1, 0};

        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) answer[0] = i;
        }

        answer[1] = (n * m) / answer[0];
        return answer;
    }
}

public class MaxAndMiniCommon {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(3, 12)));
        System.out.println(Arrays.toString(s2.solution(2, 5)));
    }
}

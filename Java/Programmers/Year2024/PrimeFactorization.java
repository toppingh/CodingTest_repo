package Java.Programmers.Year2024.Day1215;

// Title : 소인수분해
// Q. 소인수분해 : 어떤 수를 소수들의 곱으로 표현한 것
// Q. 자연수 n이 매개변수일 때, n의 소인수를 오름차순으로 담은 배열을 return하는 solution 함수

import java.util.*;

class Solution4 {
    int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

public class PrimeFactorization {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(12)));
        System.out.println(Arrays.toString(s4.solution(17)));
        System.out.println(Arrays.toString(s4.solution(420)));
    }
}

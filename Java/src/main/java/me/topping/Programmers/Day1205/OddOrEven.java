package me.topping.Programmers.Day1205;

// Title : 홀짝에 따라 다른 값 반환하기
// Q. 양의정수 n이 매개변수로 주어질 때, n이 홀수면 n이하의 홀수인 모든 양의 정수의 합, n이 짝수라면 n이하의 짝수인 모든 양의 정수의 제곱 합을 return .하는 solution 함수
class Solution6 {
    int solution (int n) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i * i;
            } else {
                oddSum += i;
            }
        }

        return n % 2 == 0 ? evenSum : oddSum;
    }
}

public class OddOrEven {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution(7));
        System.out.println(s6.solution(10));
    }
}

package me.topping.Programmers.Day1205;

// Title : 순서쌍의 개수
// Q. 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수의 순서쌍 개수를 return 하는 solution 함수
class Solution4 {
    int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }
        return answer;
    }
}

public class CntCouple {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(20));
        System.out.println(s4.solution(100));
    }
}

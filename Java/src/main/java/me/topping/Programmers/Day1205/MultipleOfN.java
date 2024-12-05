package me.topping.Programmers.Day1205;

// Title : n의 배수
// Q. 정수 num과 n이 매개변수로 주어질 때, num이 n의 배수이면 1을 return하고, n의 배수가 아니면 0을 return 하는 solution 함수
class Solution5 {
    int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}

public class MultipleOfN {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(98, 2));
        System.out.println(s5.solution(34, 3));
    }
}

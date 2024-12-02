package me.topping.Programmers.Day1202;

// Title : 두 수의 연산값 비교하기
// Q. 양의 정수 a와 b가 주어졌을 때, a + b와 2 * a * b 중 더 큰 값을 return 하는 solution 함수
// 단, a + b와 2 * a * b가 같으면 a + b return

class Solution5 {
    int solution(int a, int b) {
        return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
    }
}

public class CompareValue {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(2, 91));
        System.out.println(s5.solution(91, 2));
    }
}

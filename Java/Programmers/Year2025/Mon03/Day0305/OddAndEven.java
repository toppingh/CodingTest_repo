package Java.Programmers.Year2025.Mon03.Day0305;

// TItle : 짝수와 홀수
// Q. 정수 num이 짝수면 Even, 홀수면 Odd를 반환하는 solution 함수

class Solution5 {
    String solution (int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}

public class OddAndEven {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(3));
        System.out.println(s5.solution(4));
    }
}

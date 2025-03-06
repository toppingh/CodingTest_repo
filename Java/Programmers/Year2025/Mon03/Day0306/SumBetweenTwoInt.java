package Java.Programmers.Year2025.Mon03.Day0306;

// Title : 두 정수 사이의 합
// Q. a와 b 사이에 속한 모든 정수의 합을 return 하는 solution 함수 (a == b이면 둘 중 아무 수나 리턴)

class Solution4 {
    long solution (int a, int b) {
        long answer = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return a == b ? a : answer;
    }
}

public class SumBetweenTwoInt {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(3, 5));
        System.out.println(s4.solution(3, 3));
        System.out.println(s4.solution(5, 3));
    }
}

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

// SolutionCode -> 등차수열의 합 공식 활용 => (a1 + an) / 2 * n == (b - a + 1) x (a + b) / 2
class SolutionCode4 {
    long solution (int a, int b) {
        return sumAtoB (Math.min(a, b), Math.max(a, b));
    }

    long sumAtoB (long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}

public class SumBetweenTwoInt {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        SolutionCode4 sc4 = new SolutionCode4();

        System.out.println(s4.solution(3, 5));
        System.out.println(s4.solution(3, 3));
        System.out.println(s4.solution(5, 3));
        System.out.println();
        System.out.println(sc4.solution(3, 5));
        System.out.println(sc4.solution(3, 3));
        System.out.println(sc4.solution(5, 3));
    }
}

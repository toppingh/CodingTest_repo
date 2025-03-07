package Java.Programmers.Year2025.Mon03.Day0307;

// Title : 정수 제곱근 판별
// Q. n이 어떤 양의 정수 x의 제곱이면 x + 1의 제곱을, 제곱이 아니라면 -1을 return 하는 solution 함수

class Solution2 {
    long solution (long n) {
        if (Math.sqrt(n) == (long) Math.sqrt(n)) {
            return ((long) Math.sqrt(n) + 1) * ((long) Math.sqrt(n) + 1);
        } else {
            return -1;
        }
    }
}

public class CheckSquareRoot {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(121));
        System.out.println(s2.solution(3));
        System.out.println(s2.solution(169));
    }
}

package Java.Programmers.Year2025.Mon02.Day0217;

// Title : 주사위 게임1
// Q. 두 주사위를 굴려 나온 숫자 a, b가 모두 홀수면 a^2 + b^2점
// Q. a, b 중 하나만 홀수면 2 x (a + b)점
// Q. a, b 모두 홀수가 아니면 |a - b|점
// Q. a와 b가 매개변수로 주어질 때 얻는 점수를 return 하는 solution 함수

class Solution4 {
    int solution (int a, int b) {
        return (a % 2 == 1 && b % 2 == 1) ? (a * a) + (b * b) : (a % 2 == 1 || b % 2 == 1) ? (2 * (a + b)) : Math.abs(a - b);
    }
}

public class DiceGame1 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(3, 5));
        System.out.println(s4.solution(6, 1));
        System.out.println(s4.solution(2, 4));
    }
}

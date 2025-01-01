package me.topping.Programmers.Day1206;

// Title : 구슬을 나누는 경우의 수
// Q. 갖고있는 구슬 개수 balls와 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모은 경우의 수를 return 하는 solution 함수
class Solution5 {
    int solution (int balls, int share) {

        double answer = 1;

        for (int i = share + 1; i <= balls; i++) {
            answer *= i;
        }

        for (int i = 2; i <= balls - share; i++) {
            answer /= i;
        }

        return (int)Math.round(answer);
    }
}

public class NumberOfShareBall {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(3, 2));
        System.out.println(s5.solution(5, 3));
    }
}

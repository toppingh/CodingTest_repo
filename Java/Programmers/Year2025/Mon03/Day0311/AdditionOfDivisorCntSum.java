package Java.Programmers.Year2025.Mon03.Day0311;

// Title : 약수의 개수와 덧셈
// Q. 두 정수 left와 right가 매개변수로 주어질 때, left부터 right까지 모든 수들 중, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하는 solution 함수

class Solution1 {
    int solution (int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum = Math.sqrt(i) % 1 == 0 ? sum - i : sum + i;
        }

        return sum;
    }
}

public class AdditionOfDivisorCntSum {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(13, 17));
        System.out.println(s1.solution(24, 27));
    }
}

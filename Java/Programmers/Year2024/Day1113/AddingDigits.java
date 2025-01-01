package me.topping.Programmers.Day1113;

// Title : 자릿수 더하기
// Q. 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return 하는 solution 함수
// 제한. 0 <= n <= 1,000,000

class Solution2 {
    int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i) - '0';
        }
        return answer;
    }
}

// Solution Code
class Solution_2 {
    int solution1(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

public class AddingDigits {
    public static void main(String[] args) {

    }
}

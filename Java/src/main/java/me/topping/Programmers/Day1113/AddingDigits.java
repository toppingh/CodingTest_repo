package me.topping.Programmers.Day1113;

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

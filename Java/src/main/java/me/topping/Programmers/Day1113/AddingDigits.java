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

public class AddingDigits {
    public static void main(String[] args) {

    }
}

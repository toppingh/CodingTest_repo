package me.topping.Programmers.Day1118;

// Title : 공배수
// Q.정수 number와 n, m이 주어질때, number가 n의 배수이면서 m의 배수이면 1, 아니면 0을 return 하는 solution함수

class Solution1 {
    int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}

public class CommonMultiple {
    public static void main(String[] args) {

    }
}

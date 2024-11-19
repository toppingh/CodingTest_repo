package me.topping.Programmers.Day1119;

// Title : 피자 나눠 먹기 (2)
// Q. 피자를 6조각으로 잘라주는데, 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹으려면 최소 몇 판을 시켜야하는지 return하는 solution 함수
// 제한. 1 <= n <= 100

class Solution1 {
    int solution ( int n) {
        int cnt = 1;
        while ((cnt * 6) % n != 0) cnt++;
        return cnt;
    }
}

public class DividePizza2 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(7));
    }
}

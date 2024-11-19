package me.topping.Programmers.Day1119;

// Title : 피자 나눠 먹기 (3)
// Q. 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다. 피자 조각 수 slice와 먹는 사람 수 n이 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지 return 하는 solution 함수
// 제한. 2 <= slice <= 10, 1 <= n <= 100

class Solution2 {
    int solution(int slice, int n) {
        int cnt = 1;
        while (slice * cnt < n) ++cnt;
        return cnt;
    }
}

public class DividePizza3 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(7, 10));
    }
}

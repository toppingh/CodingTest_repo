package me.topping.Programmers.Day1206;

// Title : 조건 문자열
// Q. 두 수가 n가 m일 때 >, = : n >= m으로 <, = : n <= m으로, >, ! : n > m으로, <, ! : n < m이다. 두 문자열 ineq와 eq가 주어질 때 ineq는 <와 >중 하나고, eq는 =와 !중 하나이다.
// 그리고 두 정수 n과 m이 주어질 때 n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return 하는 solution 함수

class Solution1 {
    int solution (String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<")) {
            answer = (eq.equals("=") ? n <= m : n < m) ? 1 : 0;
        } else if (ineq.equals(">")) {
            answer = (eq.equals("=") ? n >= m : n > m) ? 1 : 0;
        }
        return answer;
    }
}

public class StringCase {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("<", "=", 20, 50));
        System.out.println(s1.solution(">", "!", 41, 78));
    }
}

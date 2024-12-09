package me.topping.Programmers.Day1125;

// Title : flag에 따라 다른 값 반환하기
// Q. 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b, false면 a - b를 return하는 solution 함수

class Solution1 {
    int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}

public class FlagValue {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(-4, 7, true));
        System.out.println(s1.solution(-4, 7, false));
    }
}

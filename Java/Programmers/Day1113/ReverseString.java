package me.topping.Programmers.Day1113;

// Title : 문자열 뒤집기
// Q. 문자열 my_string이 매개변수로 주어질때 거꾸로 뒤집은 문자열을 return하는 solution 함수
// 제한. 1 <= my_string.length <= 1,000

class Solution1 {
    String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();

        System.out.println(s1.solution("jaron"));
        System.out.println(s1.solution("bread"));
    }
}

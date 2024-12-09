package me.topping.Programmers.Day1121;

// Title : 특정 문자 제거하기
// Q. 문자열 my_string과 문자 letter이 매개변수로 주어질 때, my_string에서 letter를 제거한 문자열을 return하는 solution 함수

class Solution1 {
    String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}

public class ReduceChar {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("abcdef", "f"));
        System.out.println(s1.solution("BCBdbe", "B"));
    }
}

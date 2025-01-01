package me.topping.Programmers.Day1202;

// Title : 문자열 곱하기
// Q. 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수

class Solution3 {
    String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}

public class MultipleString {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("string", 3));
        System.out.println(s3.solution("love", 10));
    }
}

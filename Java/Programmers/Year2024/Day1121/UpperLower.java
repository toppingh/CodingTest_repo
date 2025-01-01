package me.topping.Programmers.Day1121;

// Title : 대문자와 소문자
// Q. 문자열 my_string이 매개변수로 주어질 때 대문자는 소문자로, 소문자는 대문자로 변환한 문자열을 return하는 solution 함수

class Solution3 {
    String solution(String my_string) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isUpperCase(ch)) {
                str.append(Character.toLowerCase(ch));
            } else {
                str.append(Character.toUpperCase(ch));
            }
        }
        return str.toString();
    }
}

public class UpperLower {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("cccCCC"));
        System.out.println(s3.solution("abCdEfghIJ"));
    }
}

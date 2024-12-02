package me.topping.Programmers.Day1202;

// Title : 문자열 섞기
// Q. 길이가 같은 두 문자열 str1과 str2가 주어질 때, 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return하는 solution함수

class Solution1 {
    String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}

public class MixString {
}

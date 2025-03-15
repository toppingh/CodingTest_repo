package Java.Programmers.Year2025.Mon03.Day0315;

// Title : 이상한 문자 만들기
// Q. 각 단어는 하나 이상의 공백문자로 구분되어 있다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열 return하는 solution 함수

import java.util.Locale;

class Solution2 {
    String solution (String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                idx = 0;
            } else {
                c = (idx % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
                idx++;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}

public class MakeStrangeLetter {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("try hello world"));
    }
}

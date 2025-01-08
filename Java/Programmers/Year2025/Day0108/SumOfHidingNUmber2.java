package Java.Programmers.Year2025.Day0108;

// Title : 숨어있는 숫자의 덧셈 (2)
// Q. 문자열 my_string이 매개변수로 주어질 때 my_string 안의 자연수들의 합을 return하는 solution 함수

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution2 {
    int solution (String my_string) {
        int answer = 0;

        Pattern pattern = Pattern.compile("\\d+"); // "\\d+"는 하나 이상의 연속된 숫자
        Matcher matcher = pattern.matcher(my_string);

        while (matcher.find()) {
            answer += Integer.parseInt(matcher.group());
        }

        return answer;
    }
}

// https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%95%EA%B7%9C%EC%8B%9DRegular-Expression-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%A0%95%EB%A6%AC 참고

public class SumOfHidingNUmber2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("aAb1B2cC34oOp"));
        System.out.println(s2.solution("1a2b3c4d123Z"));
    }
}

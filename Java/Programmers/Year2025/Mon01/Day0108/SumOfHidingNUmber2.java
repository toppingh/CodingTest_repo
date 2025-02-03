package Java.Programmers.Year2025.Mon01.Day0108;

// Title : 숨어있는 숫자의 덧셈 (2)
// Q. 문자열 my_string이 매개변수로 주어질 때 my_string 안의 자연수들의 합을 return하는 solution 함수

import java.util.Arrays;
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

// SolutionCode -> replace와 정규식 활용
class SolutionCode2 {
    int solution (String my_string) {
        int answer = 0;

        // my_string에서 영어 (정규표현식)인 경우 공백으로 모두 대체
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" "); // [, , , 1, 2, , 34]

        // str 배열에서 "" (공백)이 아닌 값만 int형으로 바꾸고 덧셈
        for (String s : str) {
            if (!s.equals("")) answer += Integer.parseInt(s);
        }

        return answer;
    }
}


public class SumOfHidingNUmber2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();
        System.out.println(s2.solution("aAb1B2cC34oOp"));
        System.out.println(s2.solution("1a2b3c4d123Z"));
        System.out.println();

        System.out.println(sc2.solution("aAb1B2cC34oOp"));
        System.out.println(sc2.solution("1a2b3c4d123Z"));
    }
}

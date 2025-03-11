package Java.Programmers.Year2025.Mon03.Day0311;

// Title : 문자열 내림차순으로 배치하기
// Q. 문자열 s에 나타나는 문자를 큰 것부터 작은 순으로 정렬해 새로운 문자열을 return 하는 solution 함수
// Q. s는 영문 대소문자로만 구성되어있으며, 대문자는 소문자보다 작은 것을 ㅗ간주한다.

import java.util.Arrays;
import java.util.Comparator;

class Solution2 {
    String solution (String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        return new StringBuilder (new String (ch)).reverse().toString();
    }
}

public class StringArrayDesc {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("Zbcdefg"));
    }
}

package Java.Programmers.Day1224;

// Title : 문자열 정렬하기 (2)
// Q. 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소분자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return하는 solution 함수

import java.util.Arrays;

class Solution1 {
    String solution (String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

public class SortString2 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("Bcad"));
        System.out.println(s1.solution("heLLo"));
        System.out.println(s1.solution("Python"));
    }
}

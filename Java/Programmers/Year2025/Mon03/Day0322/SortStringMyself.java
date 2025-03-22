package Java.Programmers.Year2025.Mon03.Day0322;

// Title : 문자열 내 마음대로 정렬하기
// Q. 문자열 리스트 strings와 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬.
// EX. strings = ["sun", "bed", "car"]이고 n = 1이면 각 단어의 인덱스 1의 문자 "u", "e","a"로 strings 정렬

import java.util.Arrays;

class Solution1 {
    String[] solution (String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> (s1.charAt(n) + s1).compareTo(s2.charAt(n) + s2));

        return strings;
    }
}

public class SortStringMyself {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new String[] {"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(s1.solution(new String[] {"abce", "abcd", "cdx"}, 2)));
    }
}

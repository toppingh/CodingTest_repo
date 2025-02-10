package Java.Programmers.Year2025.Mon02.Day0210;

// Title : 배열에서 문자열 대소문자 변환하기
// Q. 문자열 배열 strArr이 주어질떄, 배열에서 홀수번쨰 인덱스 문자열은 모두 대문자로, 짝수번째 인덱스 문자열은 소문자로 변환하는 solution 함수

import java.util.Arrays;

class Solution1 {
    String[] solution (String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }
}

public class ChangeUpperLower {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new String[] {"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"aBc", "AbC"})));
    }
}

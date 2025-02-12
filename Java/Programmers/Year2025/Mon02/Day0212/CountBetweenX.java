package Java.Programmers.Year2025.Mon02.Day0212;

// Title : x 사이의 개수
// Q. myString을 문자 x를 기준으로 나눴을때 나눠진 문자열 각각의 길이를 순선대로 저장한배열을 return하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (String myString) {
        String[] str = myString.split("x", -1);
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = str[i].length();
        }

        return answer;
    }
}

public class CountBetweenX {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution("oxooxoxxox")));
        System.out.println(Arrays.toString(s1.solution("xabcxdefxghi")));
    }
}

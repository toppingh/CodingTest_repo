package Java.Programmers.Year2024.Day1215;

// Title : 문자열 정렬하기 (1)
// Q. 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트 return 하는 solution 함수

import java.util.Arrays;

class Solution2 {
    int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];
        int cnt = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isDigit(ch)) answer[cnt++] = ch - '0';
        }
        Arrays.sort(answer, 0, cnt);
        return Arrays.copyOf(answer, cnt);
    }
}

public class SortString1 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution("hi12392")));
        System.out.println(Arrays.toString(s2.solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(s2.solution("abcde0")));
    }
}

package Java.Programmers.Year2025.Day0101;

// Title : 접미사 배열
// Q. 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return하는 solution 함수

import java.util.*;

class Solution2 {
    String[] solution (String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}

public class SuffixArray {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution("banana")));
        System.out.println(Arrays.toString(s2.solution("programmers")));
    }
}

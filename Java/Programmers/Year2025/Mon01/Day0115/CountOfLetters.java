package Java.Programmers.Year2025.Mon01.Day0115;

// Title : 문자 개수 세기
// Q. 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 'A'의 개수, 'B'의 개수 ... 'Z'의 개수, 'a'의 개수 ... 'z'의 개수를 순서대로 담은 길이 52의 정수배열을 return하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer[my_string.charAt(i) - 'A']++;
            } else {
                answer[26 + my_string.charAt(i) - 'a']++;
            }
        }
        return answer;
    }
}

public class CountOfLetters {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution("Programmers")));
    }
}

package Java.Programmers.Year2025.Day0101;

// Title : 잘라서 배열로 저장하기
// Q. 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    String[] solution (String my_str, int n) {
        // 배열 크기 계산
        String[] answer = new String[(my_str.length() + n - 1) / n];

        for (int i = 0; i < answer.length; i++) {
            int endIdx = Math.min(i * n + n, my_str.length());
            answer[i] = my_str.substring(i * n, endIdx);
        }
        return answer;
    }
}

public class SaveSliceArray {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(s1.solution("abcdef123", 3)));
    }
}

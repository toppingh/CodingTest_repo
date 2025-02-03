package Java.Programmers.Year2025.Mon01.Day0115;

// Title : 글자 지우기
// Q. 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    String solution (String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);

        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }

        return sb.toString();
    }
}

public class DeleteLetters {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }
}

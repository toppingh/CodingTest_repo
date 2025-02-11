package Java.Programmers.Year2025.Mon02.Day0211;

// Title : ad 제거하기
// Q. strArr 문자열 중 ad라는 문바열을 포함하는 모든 문자열을 제거하고 남은 문자여을 순서를 유지한 배ㅕㅇㄹ로 return하는  solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    String[] solution (String[] strArr) {
        List<String> str = new ArrayList<String>();

        for (String s : strArr) {
            if (!s.contains("ad")) str.add(s);
        }
        return str.toArray(new String[0]);
    }
}

public class Deletead {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new String[] {"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(s3.solution(new String[] {"there", "are", "no", "a", "ds"})));
    }
}

package Java.Programmers.Year2025.Mon02.Day0214;

// Title : 문자열 묶기
// Q. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수

import java.util.Arrays;

class Solution3 {
    int solution (String[] strArr) {
        int[] cnt = new int[31];
        int max = 0;

        for (String str : strArr) {
            max = Math.max(max, ++cnt[str.length()]);
        }
        return max;
    }
}

public class Stringing {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new String[] {"a", "bc", "d", "efg", "hi"}));
    }
}

package Java.Programmers.Year2025.Mon03.Day0307;

// Title : 정수 내림차순으로 배치하기
// Q. 정수 n을 매개변수로 받아 n의 각 자릿수를 큰 수 부터 작은 순으로 정렬한 새로운 정수 return 함수

import java.util.Arrays;

class Solution1 {
    long solution (long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}

public class SortDesc {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(118372));
    }
}

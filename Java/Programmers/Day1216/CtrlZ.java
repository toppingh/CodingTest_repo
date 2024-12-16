package Java.Programmers.Day1216;

// Title : 컨트롤 제트
// Q. 숫자와 Z가 공백으로 구분되어 담긴 문자열 s가 주어질 때, 머쓱이가 구한 값을 return하는 solution 함수
// Q. 문자열에 있는 숫자를 차례대로 더할 때 Z가 나오면 바로 전에 더했던 숫자를 뺀다.

import java.util.Arrays;

class Solution1 {
    int solution (String s) {
        int sum = 0;
        int lastIdx = 0;
        String[] str = s.split(" ");

        for (String i : str) {
            if (i.equals("Z")) {
                sum -= lastIdx;
            } else {
                sum += Integer.parseInt(i);
                lastIdx = Integer.parseInt(i);
            }
        }

        return sum;
    }
}

public class CtrlZ {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("1 2 Z 3"));
        System.out.println(s1.solution("10 20 30 40"));
        System.out.println(s1.solution("10 Z 20 Z 1"));
        System.out.println(s1.solution("10 Z 20 Z"));
        System.out.println(s1.solution("-1 -2 -3 Z"));
    }
}

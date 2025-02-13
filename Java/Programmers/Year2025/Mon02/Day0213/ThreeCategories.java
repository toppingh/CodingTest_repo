package Java.Programmers.Year2025.Mon02.Day0213;

// Title : 세 개의 구분자
// Q. 문자열 myStr이 주어졌을 때 a, b, c를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return하는 solution 함수
// Q. 단, 두 구분자 사이에 다른 문자가 없을 경우 아무것도 저장하지 않는다.
// Q. return 할 배열이 빈 배열이라면 ["EMPTY"]를 return한다.

import java.util.Arrays;

class Solution1 {
    String[] solution (String myStr) {
        myStr = myStr.replaceAll("[a-c]", " ");
        return myStr.trim().split("\\s+")[0].isEmpty() ? new String[] {"EMPTY"} : myStr.trim().split("\\s+");

    }
}

public class ThreeCategories {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution("baconlettucetomato")));
        System.out.println(Arrays.toString(s1.solution("abcd")));
        System.out.println(Arrays.toString(s1.solution("cabab")));
    }
}

package Java.Programmers.Year2025.Mon02.Day0211;

// Title : 공백으로 구분하기2
// Q. 단어가 공배 한 개 이상으로 구분되어 있는 문자열 my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수

import java.util.Arrays;

class Solution5 {
    String[] solution (String my_string) {
        return my_string.trim().split("\\s+");
    }
}

public class DistinguishToSpace2 {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(Arrays.toString(s5.solution("  i  love you")));
        System.out.println(Arrays.toString(s5.solution("  programmers  ")));
    }
}

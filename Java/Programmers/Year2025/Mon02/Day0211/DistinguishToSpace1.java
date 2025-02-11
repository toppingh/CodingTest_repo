package Java.Programmers.Year2025.Mon02.Day0211;

// Title : 공백으로 구분하기1
// Q. 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    String[] solution (String my_string) {
        return my_string.split(" ");
    }
}

public class DistinguishToSpace1 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution("i love you")));
        System.out.println(Arrays.toString(s4.solution("programmers")));
    }
}

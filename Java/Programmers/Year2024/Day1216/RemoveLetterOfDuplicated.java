package Java.Programmers.Year2024.Day1216;

// Title : 중복된 문자 제거
// Q. 문자열 my_string이 매개변수로 주어질 때, my_string에서 중복된 문자를 제거하고, 하나의 문자만 남긴 문자열을 return하는 solution 함수

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution2 {
    String solution (String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()){
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// SolutionCode -> HashSet 활용
class SolutionCode2 {
    String solution (String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer)); // 중복 제거 && 순서 유지

        return String.join("", set); // 중벅 제거된 문자를 합쳐 하나의 문자열로 반환
    }
}


public class RemoveLetterOfDuplicated {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(s2.solution("people"));
        System.out.println(s2.solution("We are the world"));
        System.out.println();

        System.out.println(sc2.solution("people"));
        System.out.println(sc2.solution("We are the world"));
    }
}

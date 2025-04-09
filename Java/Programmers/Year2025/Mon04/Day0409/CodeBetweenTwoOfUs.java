package Java.Programmers.Year2025.Mon04.Day0409;

// Title : 둘만의 암호
// Q. 문자열 s, skip, 자연수 index가 주어질 때 아래 규칙에 따라 문자열을 만드려고 한다.
// 1. 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔준다.
// 2. index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아간다.
// 3. skip에 있는 알파벳은 제외하고 건너뛴다.
// Q. 위 규칙대로 s를 변환한 결과를 return 하는 solution 함수

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    String solution (String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                list.add(c);
            }
        }

        for (char c : s.toCharArray()) {
            sb.append(list.get((list.indexOf(c) + index) % list.size()));
        }

        return sb.toString();
    }
}

// SolutionCode - while문 활용
class SolutionCode2 {
    String solution (String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            char tmp = c;
            int idx = 0;

            while (idx < index) {
                tmp = (tmp == 'z') ? 'a' : (char) (tmp + 1);
                if (!skip.contains(String.valueOf(tmp))) {
                    idx += 1;
                }
            }
            sb.append(tmp);
        }
        return sb.toString();
    }
}

public class CodeBetweenTwoOfUs {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(s2.solution("aukks", "wbqd", 5));
        System.out.println(sc2.solution("aukks", "wbqd", 5));
    }
}

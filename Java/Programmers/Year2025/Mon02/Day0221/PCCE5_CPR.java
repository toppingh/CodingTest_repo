package Java.Programmers.Year2025.Mon02.Day0221;

// Title : [PCCE 기출문제] 5번 / 심폐소생술
// Q. 심폐소생술을 하는 방법의 순서가 담긴 문자열들이 무작위 순서로 담긴 cpr 리스트가 주어진다.
// Q. 각각의 방법이 몇번째 단계인지 순서대로 담아 return 하는 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < basic_order.length; j++) {
                if (cpr[i].equals(basic_order[j])) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}

public class PCCE5_CPR {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new String[] {"call", "respiration", "repeat", "check", "pressure"})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"respiration", "repeat", "check", "pressure", "call"})));
    }
}

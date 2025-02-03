package Java.Programmers.Year2025.Mon01.Day0123;

// Title : 5명씩
// Q. 줄 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 앞에서부터 5명씩 묶음 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return 하는 solution 함수
// Q. 마지막 그룹이 5명이 아니여도 가장 앞에 있는 사람 이름 포함

import java.util.Arrays;

class Solution2 {
    String[] solution(String[] names) {
        String[] answer = new String[names.length / 5 + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }
}

public class FivePeople {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }
}

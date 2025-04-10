package Java.Programmers.Year2025.Mon04.Day0410;

// Title : 대충 만든 자판
// Q. 1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열 배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어진다.
// Q. 이때, 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 {
    int[] solution (String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];

        // 1. 문자별 최소 누름 횟수 저장하는 부분
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                map.put(key.charAt(i), Math.min(map.getOrDefault(key.charAt(i), Integer.MAX_VALUE), i + 1));
            }
        }

        // 2. 각 target별 누름 횟수 계산 부분
        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)) {
                    cnt = -1;
                    break;
                }
                cnt += map.get(c);
            }
            answer[i] = cnt;
        }
        return answer;
    }
}

public class Keyboard {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD", "AABB"})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"AA"}, new String[] {"B"})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"AGZ", "BSSS"}, new String[] {"ASA", "BGZ"})));
    }
}

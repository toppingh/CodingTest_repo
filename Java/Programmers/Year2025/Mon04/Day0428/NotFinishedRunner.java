package Java.Programmers.Year2025.Mon04.Day0428;

// Title : 완주하지 못한 선수
// Q. 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하는 solution 함수

import java.util.HashMap;

class Solution2 {
    String solution (String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // HashMap에 이름별 카운트 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // HashMap에서 completion 해당 이름 제거
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // keySet()으로 0이 아닌 key값 return
        for (String k : map.keySet()) {
            if (map.get(k) != 0) {
                return k;
            }
        }
        return "";
    }
}

public class NotFinishedRunner {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        System.out.println(s2.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
        System.out.println(s2.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }
}

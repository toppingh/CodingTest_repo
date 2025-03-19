package Java.Programmers.Year2025.Mon03.Day0319;

// Title : 가장 가까운 같은 글자
// Q. 문자열 s의 각 위치마다 자신보다 앞에 나와있으면서 가장 가까운 곳에 있는 같은 글자
// Q. s = "banana"일 때, b는 처음 나왔으므로 앞에 같은 글자 x => -1로 표현, a는 처음 나왔으므로 앞에 같은 글자 x => -1로 표현
// Q. n은 처음 나왔으므로 앞에 같은 글자 x => -1로 표현, a는 자신보다 두 칸 앞에 있으므로 2로 표현
// Q. n도 자신보다 두 칸 앞에 있으므로 2로 표현, a는 자신보다 두칸, 네칸 앞에 있는데, 가장 가까운 것이 두 칸 앞이므로 2로 표현
// Q. 위와 같이 정의된 연산을 수행하는 solution 함수

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    int[] solution (String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> idx = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // 이전 등장 위치가 있을 경우, 현재 인덱스에서 뺀 값 저장
            if (idx.containsKey(s.charAt(i))) {
                answer[i] = i - idx.get(s.charAt(i));
            } else {
                // 처음 나온다면 -1 저장
                answer[i] = -1;
            }
            // 현재 문자의 위치 업데이트
            idx.put(s.charAt(i), i);
        }

        return answer;
    }
}

public class NearestSameLetter {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution("banana")));
        System.out.println(Arrays.toString(s2.solution("foobar")));
    }
}

package Java.Programmers.Day1209;

// Title : 등차수열의 특정한 항만 더하기
// Q. 첫째 항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할때, 이 등차수열의 1항부터 n항까지 include가 true인 항들만 더한 값을 return하는 solution 함수

class Solution2 {
    int solution (int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) answer += a + d * i;
        }
        return answer;
    }
}

public class EquidistantSequence {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(3, 4, new boolean[] {true, false, false, true, true}));
        System.out.println(s2.solution(7, 1, new boolean[] {false, false, false, true, false, false, false}));
    }
}

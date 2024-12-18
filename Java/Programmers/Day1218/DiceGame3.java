package Java.Programmers.Day1218;

// Title : 주사위 게임3
// Q. 네 주사위에서 나온 숫자가 모두 p로 같으면 1111 x p점, 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p != q)라면 (10 x p + 1)^2점
// Q. 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p != q)라고 한다면 (p + q) x |p - q|점
// Q. 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 각각 나온 숫자가 각각 p와 다른 q, r(q != r)이라면 q x r점
// Q. 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자만큼의 점수를 얻는다.
// Q. 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수

import java.util.*;

class Solution6 {
    int solution (int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};

        // HashMap -> 각 주사위 값이 몇 번 등장했는지 카운트
        Map<Integer, Integer> cntMap = new HashMap<>();

        // 주사위 값 등장 횟수
        for (int i : arr) {
            // 각 주사위 값이 등장할 때마다 +1
            cntMap.put(i, cntMap.getOrDefault(i, 0) + 1);
        }

        // 주사위 4개 모두 같은 값일 때
        if (cntMap.size() == 1) {
            return 1111 * arr[0];

            // 2가지 값일 때
        } else if (cntMap.size() == 2) {

            // case1 : 3개가 같은 값, 나머지 하나는 다른 값
            if (cntMap.containsValue(3)) {
                // 3번 등장한 숫자 p, 1번 등장한 숫자 q
                int p = 0, q = 0;
                for (int j : cntMap.keySet()) {
                    if (cntMap.get(j) == 3) p = j;
                    else q = j;
                }
                return (10 * p + q) * (10 * p + q);

                // 주사위 2개씩 같은 값일 때
            } else {
                // 각 값이 2번 등장하는 값 두 개 p, q
                int p = 0, q = 0;
                for (int j : cntMap.keySet()) {
                    if (cntMap.get(j) == 2) {
                        if (p == 0) p = j;
                        else q = j;
                    }
                }
                return (p + q) * Math.abs(p - q);
            }

            // 2개는 같은 값, 나머지는 다른 값일 때
        } else if (cntMap.size() == 3) {
            int p = 0, q = 0, r = 0;
            for (int j : cntMap.keySet()) {
                // 2번 등장하는 숫자
                if (cntMap.get(j) == 2) p = j;
                // 1번 등장하는 숫자
                else if (q == 0) q = j;
                // 1번 등장하는 또 다른 숫자
                else r = j;
            }
            return q * r;

            // 4개 값이 모두 다를 때
        } else {
            // 오름차순 정렬 -> 가장 작은 값이 0번째
            Arrays.sort(arr);
            return arr[0];
        }
    }
}

public class DiceGame3 {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution(2, 2, 2, 2));
        System.out.println(s6.solution(4, 1, 4, 4));
        System.out.println(s6.solution(6, 3, 3, 6));
        System.out.println(s6.solution(2, 5, 2, 6));
        System.out.println(s6.solution(6, 4, 2, 5));
    }
}
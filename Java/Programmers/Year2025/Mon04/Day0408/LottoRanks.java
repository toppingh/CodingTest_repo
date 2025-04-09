package Java.Programmers.Year2025.Mon04.Day0408;

// Title : 로또의 최고순위와 최저 순위
// Q. 알아볼 수 없는 번호는 0이고, 순서 상관없이 구매한 로또에 당첨번호와 일치하는 번호가 있으면 맞힌 걸로 인정된다.
// Q. 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어질 때, 당첨 가능한 최고 순위와 최저 순위를 차례로 담은 배열을 return 하는 solution 함수

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution2 {
    int[] solution(int[] lottos, int[] win_nums) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int cnt = 0, zero = 0;
        Set<Integer> set = new HashSet<>();

        for (int i : win_nums) {
            set.add(i);
        }

        for (int i : lottos) {
            if (i == 0) {
                zero++;
            } else if (set.contains(i)) {
                cnt++;
            }
        }

        int[] list = {6, 6, 5, 4, 3, 2, 1};
        return new int[] {list[cnt + zero], list[cnt]};
    }
}

public class LottoRanks {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(s2.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(s2.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
    }
}

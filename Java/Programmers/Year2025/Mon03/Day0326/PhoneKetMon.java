package Java.Programmers.Year2025.Mon03.Day0326;

// Title : 폰켓몬
// Q. 최대한 많은 폰켓몬을 포함해 N/2마리를 선택하려 한다. N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾는다.
// Q. 이 때 폰켓몬 종류 번호와 개수를 return 하는 solution 함수
// Q. 총 N마리의 폰켓몬 중 N/2마리를 가져갈 수 있고, 같은 종류의 폰켓몬은 같은 번호를 갖는다.

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

class Solution2 {
    int solution (int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        System.out.println("set : " + set);

        return Math.min(set.size(), nums.length / 2);

    }
}

public class PhoneKetMon {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {3, 1, 2, 3}));
        System.out.println(s2.solution(new int[] {3, 3, 3, 2, 2, 4}));
        System.out.println(s2.solution(new int[] {3, 3, 3, 2, 2, 2}));
    }
}

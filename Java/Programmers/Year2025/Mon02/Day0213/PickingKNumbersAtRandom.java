package Java.Programmers.Year2025.Mon02.Day0213;

// Title : 무작위로 K개의 수 뽑기
// Q. 일정 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온 적이 없는 수이면 배열 맨 뒤에 추가하는 방식
// Q. 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상한다.
// Q. 무작위의 수는 arr에 저장된 순서대로 주어질 예정일때, 완성될 배열을 return 하는 solution 함수
// Q. 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워 return한다.

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

class Solution5 {
    int[] solution (int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) if (set.size() < k) set.add(num);

        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        int i = 0;
        for (int num : set) answer[i++] = num;

        return answer;
    }
}

public class PickingKNumbersAtRandom {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(Arrays.toString(s5.solution(new int[] {0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(s5.solution(new int[] {0, 1, 1, 1, 1}, 4)));
    }
}

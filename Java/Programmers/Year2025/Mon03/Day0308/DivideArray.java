package Java.Programmers.Year2025.Mon03.Day0308;

// Title : 나누어 떨어지는 숫자 배열
// Q. array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 return 하는 solution 함수
// Q. divisor로 나누어 떨어지는 element가 하나도 없으면 배여렝 -1을 담아 return

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    int[] solution (int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer.length == 0 ? new int[] {-1} : answer;

    }
}

public class DivideArray {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[] {5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(s2.solution(new int[] {2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(s2.solution(new int[] {3, 2, 6}, 10)));
    }
}

package Java.Programmers.Year2025.Day0120;

// Title : 배열 만들기3
// Q. intervals는 [[a1, b1], [a2, b2]] 꼴로 주어지며 각 구간은 닫힌 구간이다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미한다
// Q. 이 때 배열 arr의 첫번쨰 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    int[] solution (int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class CreateArray3 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[] {1, 2, 3, 4, 5}, new int[][] {{1, 3}, {0, 4}})));
    }
}

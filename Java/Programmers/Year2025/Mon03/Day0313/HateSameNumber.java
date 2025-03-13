package Java.Programmers.Year2025.Mon03.Day0313;

// Title : 같은 숫자는 싫어
// Q. 배열 arr이 주어질 떄, 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 한다. 제거된 후 남은 수들을 반환할 때 배열 arr의 원소들의 순서를 유지해야 한다.
// Q. 예) arr ] [1, 1, 3, 3, 0, 1, 1]이면 [1, 3, 0, 1] return
// Q. arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    int[] solution (int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

//        return list.stream().toArray(i -> i).toArray();

        return answer;
    }
}

public class HateSameNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s1.solution(new int[] {4, 4, 4, 3, 3})));
    }
}

package Java.Programmers.Year2025.Mon02.Day0216;

// Title : 배열의 원소 삭제하기
// Q. 정수 배열 arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소드른 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    int[] solution (int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        for (int i : delete_list) {
            list.remove((Integer) i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class DeleteElementsOfArray {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(new int[] {293, 1000, 395, 678, 94}, new int[] {94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(s4.solution(new int[] {110, 66, 439, 785, 1}, new int[] {377, 823, 119, 43})));

    }
}

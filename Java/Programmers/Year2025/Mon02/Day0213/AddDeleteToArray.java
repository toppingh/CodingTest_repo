package Java.Programmers.Year2025.Mon02.Day0213;

// Title : 빈 배열에 추가, 삭제하기
// Q. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어진다.
// Q. flag를 차례대로 순회하며 flag[i]가 true면 X의 뒤에 arr[i]를, arr[i] x 2번 추가하고, false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    int[] solution (int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            } else {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

public class AddDeleteToArray {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new int[] {3, 2, 4, 1, 3}, new boolean[] {true, false, true, false, false})));
    }
}

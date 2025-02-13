package Java.Programmers.Year2025.Mon02.Day0213;

// Title : 배열 만들기6
// Q. 0과 1로만 이루어진 정수 배열 arr을 이용해 새로운 배열 stk를 만드려고 한다.
// Q. i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 아래를 반복한다.
// Q. stk가 빈 배열이면 arr[i]를 stk에 추가하고, i에 1을 더한다.
// Q. stk에 원소가 있고 stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더한다.
// Q. stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더한다.
// Q. 위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수
// Q. 만약 빈 배열을 return 한다면 [-1] return

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    int[] solution (int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i : arr) {
            if (stk.isEmpty() || stk.get(stk.size() - 1) != i) {
                stk.add(i);
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.isEmpty() ? new int[] {-1} : stk.stream().mapToInt(i -> i).toArray();
    }
}

public class CreateArray6 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(new int[] {0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(s4.solution(new int[] {0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(s4.solution(new int[] {0, 1, 1, 0})));
    }
}

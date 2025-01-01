package Java.Programmers.Year2024.Day1217;

// Title : 배열 만들기 4
// Q. 정수 배열 arr를 이용해 새로운 배열 stk를 만드려고 한다. 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복한다.
// Q. stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더한다.
// Q. stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더한다.
// Q. stk의 원소가 있는데, stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거한다.
// Q. 위 작업을 마친 후 만들어진 stk를 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution5 {
    int[] solution (int[] arr) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if (list.isEmpty() || list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else {
                list.remove(list.get(list.size() - 1));
            }
        }

        int[] stk = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
}

class SolutionCode5 {
    int[] solution (int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else {
                stack.pop();
            }
        }

        int[] stk = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            stk[j] = stack.get(j);
        }

        return stk;
    }
}

public class MakeArray4 {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        SolutionCode5 sc5 = new SolutionCode5();

        System.out.println(Arrays.toString(s5.solution(new int[] {1, 4, 2, 5, 3})));
        System.out.println();
        System.out.println(Arrays.toString(sc5.solution(new int[] {1, 4, 2, 5, 3})));
    }
}

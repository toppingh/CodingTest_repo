package Java.Programmers.Year2025.Day0121;

// Title : 2의 영역
// Q. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return하는 solution 함수
// Q. 단 arr에 2가 없으면 -1 return

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.copyOfRange;

class Solution1 {
    int[] solution (int[] arr) {
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i;
            }
        }

        if (start == -1) return new int[] {-1};

        return copyOfRange(arr, start, end + 1);
    }
}

public class AreaOf2 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 2, 1})));
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 1, 1})));
    }
}

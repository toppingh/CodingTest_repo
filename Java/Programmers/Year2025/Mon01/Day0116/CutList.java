package Java.Programmers.Year2025.Mon01.Day0116;

// Title : 리스트 자르기
// Q. 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어진다.
// Q. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 아래와 같이 num_list를 슬라이싱한 리스트를 return하는 solution 함수
// n = 1 : num_list의 0 ~ b 인덱스까지
// n = 2 : num_list의 a ~ 마지막 인덱스까지
// n = 3 : num_list의 a ~ b 인덱스까지
// n = 4 : num_list의 a ~ b 인덱스까지 c간격으로

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.copyOfRange;

class Solution1 {
    int[] solution (int n, int[] slicer, int[] num_list) {
        switch (n) {
            case 1 :
                return copyOfRange(num_list, 0, slicer[1] + 1);
            case 2 :
                return copyOfRange(num_list, slicer[0], num_list.length);
            case 3 :
                return copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 :
                int len = (slicer[1] - slicer[0]) / slicer[2] + 1;
                int[] answer = new int[len];
                for (int i = slicer[0], idx = 0; i <= slicer[1]; i += slicer[2], idx++) {
                    answer[idx] = num_list[i];
                }
                return answer;
        }
        return new int[0];
    }
}

public class CutList {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(3, new int[] {1, 5, 2}, new int[] {1 ,2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(s1.solution(4, new int[] {1, 5, 2}, new int[] {1 ,2, 3, 4, 5, 6, 7, 8, 9})));
    }
}

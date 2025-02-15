package Java.Programmers.Year2025.Mon02.Day0215;

// Title : 뒤에서 5등 위로
// Q. 정수로 이루어진 리스트 num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return 하는 solutino 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}

public class BackTo5th {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}

package Java.Programmers.Year2025.Mon02.Day0214;

// Title : 뒤에서 5까지
// q. 정수로 이루어진 리스트 num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return 하는 solution 함수

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

class Solution5 {
    int[] solution (int[] num_list) {
        Arrays.sort(num_list);

        return copyOfRange(num_list, 0, 5);
    }
}

public class FromBackTo5th {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(Arrays.toString(s5.solution(new int[] {12, 4, 15, 46, 38, 1, 14})));
    }
}

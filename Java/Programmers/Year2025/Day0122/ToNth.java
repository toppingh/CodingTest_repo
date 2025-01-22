package Java.Programmers.Year2025.Day0122;

// Title : n번째 원소까지
// Q. 정수 리스ㅡㅌ num_list와 정수 n이 주어질 때 num_list의 첫 번째 원소부터 n번째 원소까지의 모든 원소를 담은 리스트를 return하는 solution 함수

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

class Solution4 {
    int[] solution (int[] num_list, int n) {
        return copyOfRange(num_list, 0, n);
    }
}

public class ToNth {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(s4.solution(new int[] {5, 2, 1, 7, 5}, 3)));
    }
}

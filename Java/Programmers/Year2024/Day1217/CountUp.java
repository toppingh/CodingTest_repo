package Java.Programmers.Year2024.Day1217;

// Title : 카운트 업
// Q. 정수 start_num와 end_num이 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하는 solution 함수

import java.util.Arrays;

class Solution3 {
    int[] solution (int start_num, int end_num) {
        int[] arr = new int[end_num - start_num + 1];

        for (int i = start_num; i <= end_num; i++) {
            arr[i - start_num] = i;
        }
        return arr;
    }
}

public class CountUp {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(3, 10)));
    }
}

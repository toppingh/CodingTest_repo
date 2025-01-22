package Java.Programmers.Year2025.Day0122;

// Title : 순서 바꾸기
// Q. 정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n번째 원소 이후의 원소들과 n번째까지의 원소들로 나눠 n번째 원소 이후의 원소들을 n번째까지의 원소들 앞에 붙인 리스트를 return 하는 solution 함수

import java.util.Arrays;

class Solution2 {
    int[] solution (int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);

        return answer;
    }
}

public class ChangeOrder {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(s2.solution(new int[] {5, 2, 1, 7, 5}, 3)));
    }
}

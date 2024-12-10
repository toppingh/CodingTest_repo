package Java.Programmers.Day1210;

// Title : 2차원으로 만들기
// Q. num_list와 정수 n이 매개변수로 주어질 때 아래 설명과 같이 2차원 배열로 바꿔 return하는 solution 함수
// Q. num_list를 2 * 4 배열로 변경한다. 2차원으로 바꿀 때 num_list의 원소들을 앞에서부트 n개씩 나눠 2차원 배열로 변경한다.

import java.util.Arrays;

class Solution2 {
    int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
}

public class Make2Dimensions {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        s2.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        System.out.println(Arrays.deepToString(s2.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(s2.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }
}

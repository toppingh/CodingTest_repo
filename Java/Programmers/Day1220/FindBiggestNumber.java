package Java.Programmers.Day1220;

// Title : 가장 큰 수 찾기
// Q. 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}

public class FindBiggestNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new int[] {1, 8, 3})));
        System.out.println(Arrays.toString(s1.solution(new int[] {9, 10, 11, 8})));
    }
}

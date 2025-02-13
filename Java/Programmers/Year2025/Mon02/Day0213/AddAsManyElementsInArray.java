package Java.Programmers.Year2025.Mon02.Day0213;

// Title : 배열의 원소만큼 추가하기
// Q. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤 배열 X를 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    int[] solution (int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class AddAsManyElementsInArray {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(s2.solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(s2.solution(new int[]{1})));
    }
}

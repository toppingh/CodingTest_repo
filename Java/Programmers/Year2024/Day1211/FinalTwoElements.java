package Java.Programmers.Year2024.Day1211;

// Title : 마지막 두 원소
// Q. 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을, 크지 않다면 마지막 원소를 두 배한 값을 추가해 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int last = num_list[num_list.length - 1];
        int last2 = num_list[num_list.length - 2];

        answer[answer.length - 1] = last > last2 ? last - last2 : last * 2;

        return answer;
    }
}

public class FinalTwoElements {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[]{2, 1, 6}));
        System.out.println(s1.solution(new int[]{5, 2, 1, 7, 5}));
    }
}

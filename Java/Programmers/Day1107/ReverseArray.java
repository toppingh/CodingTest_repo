package me.topping.Programmers.Day1107;

// Title : 배열 뒤집기
// Q. 정수가 들어있는 배열 num_list가 매개변수로 주어질때, num_list의 원소 순서를 거꾸로 뒤집은 배열을 return하는 solution 함수
// 1 <= num_list 길이 <= 1,000    0 <= num_list 원소 <= 1,000

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}

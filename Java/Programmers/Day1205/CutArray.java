package me.topping.Programmers.Day1205;

// Title : 배열 자르기
// Q. 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열 return하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

public class CutArray {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[]{1, 3, 5}, 1, 2));
        System.out.println(s1.solution(new int[]{1, 2, 3, 4, 5}, 1, 3));
    }
}

package me.topping.Programmers.Day1114;

// Title : 짝수는 싫어요
// Q. 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열 return 하는 solution 함수
// 제한. 1 <= n <= 100

import java.util.*;
import java.util.stream.IntStream;

class Solution1 {
    int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

// Solution Code
class Solution1_1 {
    int[] solution1(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).toArray();
    }
}

public class HateEven {
    public static void main(String[] args) {

        Solution1 s1 = new Solution1();

        System.out.println(Arrays.toString(s1.solution(10)));
        System.out.println(Arrays.toString(s1.solution(15)));
    }
}

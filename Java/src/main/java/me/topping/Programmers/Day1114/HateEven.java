package me.topping.Programmers.Day1114;

// Title : 짝수는 싫어요
// Q. 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열 return 하는 solution 함수
// 제한. 1 <= n <= 100

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

public class HateEven {
    public static void main(String[] args) {

    }
}

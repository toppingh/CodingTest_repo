package me.topping.Programmers.Day1118;

// Title : 중앙값 구하기
// Q. 어떤 주어진 값들을 크기 순서대로 정렬했을 때 가장 중앙에 위치하는 값 = 중앙값, 정수 배열 array가 매개변수로 주어질 때 중앙값을 return 하는 solution 함수

import java.util.Arrays;

class Solution2 {
    int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
        // return array[array.length >> 2]; => Solution Code
    }
}

public class MedianValue {
}

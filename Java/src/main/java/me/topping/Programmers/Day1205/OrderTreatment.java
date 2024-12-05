package me.topping.Programmers.Day1205;

import java.util.Arrays;

// Title : 진료순서 정하기
// Q. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정하는 배열 return하는 solution 함수
class Solution3 {
    int[] solution(int[] emergency) {
        int[] sortArr = emergency.clone();
        Arrays.sort(sortArr);
        
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sortArr.length; j++) {
                if (emergency[i] == sortArr[j]) {
                    answer[i] = sortArr.length - j;
                    break;
                }
            }
        }
        return answer;
    }
}

public class OrderTreatment {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[]{3, 76, 24}));
        System.out.println(s3.solution(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(s3.solution(new int[]{30, 10, 23, 6, 100}));
    }
}

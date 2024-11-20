package me.topping.Programmers.Day1120;

// Title : 짝수 홀수 개수
// Q. 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하는 solution 함수
class Solution2 {
    int[] solution(int[] num_list) {
        int evenCnt = 0;
        int oddCnt = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) evenCnt++;
            if (num_list[i] % 2 != 0) oddCnt++;
        }
        return new int[]{evenCnt, oddCnt};
    }
}

public class CntEvenOddNumber {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();

        s2.solution(new int[]{1, 3, 5, 7});
        s2.solution(new int[]{1, 2, 3, 4, 5});
    }
}

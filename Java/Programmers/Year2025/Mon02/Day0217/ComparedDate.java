package Java.Programmers.Year2025.Mon02.Day0217;

// Title :  날짜 비교하기
// Q. date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수

import java.util.Arrays;

class Solution5 {
    int solution (int[] date1, int[] date2) {
        return (date1[0] != date2[0]) ? (date1[0] < date2[0] ? 1 : 0) :
                (date1[1] != date2[1]) ? (date1[1] < date2[1] ? 1 : 0) :
                        (date1[2] < date2[2] ? 1 : 0);
    }
}

public class ComparedDate {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(new int[] {2021, 12, 28}, new int[] {2021, 12, 29}));
        System.out.println(s5.solution(new int[] {1024, 10, 24}, new int[] {1024, 10, 24}));
    }
}

package Java.Programmers.Year2025.Mon03.Day0306;

// Title : 자연수 뒤집어 배열로 만들기
// Q. 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 return 하는 solution 함수

import java.util.Arrays;

class Solution3 {
    int[] solution (long n) {
        int[] answer = new int[String.valueOf(n).length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}

public class ReverseToArray {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(12345)));
    }
}

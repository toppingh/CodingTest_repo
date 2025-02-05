package Java.Programmers.Year2025.Mon02.Day0204;

// Title : 조건에 맞게 수열 변환하기 2
// Q. 정수 배열 arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수는 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더한다.
// Q. 이 작업을 x번 반복한 결과 배열을 arr(x)라고 표현했을 떄, arr(x) = arr(x + 1)인 x가 항상 존재한다.
// Q. 이러한 x중 가장 작은 값을 return 하는 solution 함수
// Q. 단, 두 배열에 대한 = 는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미한다.

import java.util.Arrays;

class Solution2 {
    int solution (int[] arr) {
        int answer = 0;
        boolean check = true;

        while (check) {
            answer++;
            check = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    check = true;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    check = true;
                }
            }
        }
        return answer - 1;
    }
}

public class SequenceConversion2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {1, 2, 3, 100, 99, 98}));
    }
}

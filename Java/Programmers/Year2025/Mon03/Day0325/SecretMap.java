package Java.Programmers.Year2025.Mon03.Day0325;

// Title : [1차] 비밀지도
// Q. 지도는 한 변의 길이가 n인 정사각형 배열 형태로 각 칸은 공백 (" ") 또는 "벽("#") 두 종류로 이루어져 있다.
// Q. 전체 지도는 두 장의 지도를 겹쳐 얻을 수 있다. 각 지도1과 지도2라고 할 때, 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
// Q. 지도1과 2는 각각 정수 배열로 암호화되어 있다.
// Q. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
// Q. 지도의 한 변의 크기 n과 2개의 정수 배열 arr1, arr2가 매개변수로 주어질 때, 원래의 비밀지도를 해독해 #, 공백으로 구성된 문자열 배열로 출력하라.

import java.util.Arrays;

class Solution1 {
    String[] solution (int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);

            binary = "0".repeat(n - binary.length()) + binary;

            answer[i] = binary.replace('1', '#').replace('0', ' ');
        }

        return answer;
    }
}

public class SecretMap {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(s1.solution(6, new int[] {46, 33, 33, 22, 31, 50}, new int[] {27, 56, 19, 14, 14, 10})));
    }
}

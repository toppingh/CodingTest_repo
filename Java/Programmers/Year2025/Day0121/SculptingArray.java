package Java.Programmers.Year2025.Day0121;

// Title : 배열 조각하기
// Q. 정수 배열 arr와 query가 주어진다. 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버린다.
// Q. 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버린다.
// Q. 위 작업을 마친 후 남은 arr의 부분 배열을 return하는 solution 함수

import java.util.Arrays;
import static java.util.Arrays.copyOfRange;

class Solution2 {
    int[] solution (int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = copyOfRange(arr, 0, query[i] + 1);
            } else {
                arr = copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}

public class SculptingArray {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new int[] {0, 1, 2, 3, 4, 5}, new int[] {4, 1, 2})));
    }
}

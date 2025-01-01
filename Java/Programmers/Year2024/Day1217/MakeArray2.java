package Java.Programmers.Year2024.Day1217;

// Title : 배열 만들기 2
// Q. 정수 l과 r이 주어졌을 때, l이상 r이하의 정수 중 숫자 0과 5로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return하는 solution 함수
// Q. 만약 그런 정수가 없다면 -1이 담긴 배열 return

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    int[] solution (int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            int num = i;
            boolean check = true;

            while (num > 0) {
                if (num % 10 != 5 && num % 10 != 0) {
                    check = false;
                    break;
                }
                num /= 10;
            }

            if (check) {
                list.add(i);
            }
        }
        return list.size() != 0 ? list.stream().mapToInt(n -> n).toArray() : new int[]{-1};
    }
}

// SolutionCode -> 2진법 활용
class SolutionCode2 {
    int[] solution (int l, int r) {
        ArrayList<Integer> list = new ArrayList<>(); // 결과 저장 리스트 초기화

        for (int i = 1; i < 64; i++) { // 1부터 63까지 반복 (이진수로 표현할 수 있는 숫자는 최대 6자리까지 필요, 111111 = 63)
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5; // i를 이진 문자열로 변환해 정수로 바꾼 후 * 5 값을 num에 저장

            if (l <= num && num <= r) { // l <= num <= r 이면 리스트에 추가
                list.add(num);
            }

        }
        return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(i -> i).toArray();
    }
}

public class MakeArray2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(Arrays.toString(s2.solution(5, 555)));
        System.out.println(Arrays.toString(s2.solution(10, 20)));
        System.out.println();
        System.out.println(Arrays.toString(sc2.solution(5, 555)));
        System.out.println(Arrays.toString(sc2.solution(10, 20)));
    }
}

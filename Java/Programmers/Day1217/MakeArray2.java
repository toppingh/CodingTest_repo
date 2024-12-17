package Java.Programmers.Day1217;

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


public class MakeArray2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(5, 555)));
        System.out.println(Arrays.toString(s2.solution(10, 20)));
    }
}

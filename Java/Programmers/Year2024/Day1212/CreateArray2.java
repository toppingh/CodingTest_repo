package Java.Programmers.Year2024.Day1212;

// Title : 배열 만들기2
// Q. 정수 l과 r이 주어질 때, l 이상 r 이하의 정수 중 숫자 0과 5로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수
// Q. 만약 해당하는 정수가 없을 경우 -1이 담긴 배열 return

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = "" + i;
            boolean check = true;

            for (char c : str.toCharArray()) {
                if (c != '0' && c != '5') {
                    check = false;
                    break;
                }
            }

            if (check) list.add(i);
        }
        if (list.isEmpty()) return new int[]{-1};

        int[] answer = new int [list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class CreateArray2 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(5, 555)));
        System.out.println(Arrays.toString(s4.solution(10, 20)));
    }
}

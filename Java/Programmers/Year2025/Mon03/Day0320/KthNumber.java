package Java.Programmers.Year2025.Mon03.Day0320;

// Title : K번째 수
// Q. 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 한다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    int[] solution (int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];

//        for (int i = 0; i < commands.length; i++) {
//            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
//                list.add(array[j]);
//            }
//            list.sort(Integer::compareTo);
//            answer[i] = list.get(commands[i][2] - 1);
//            list.clear();
//        }


        for (int i = 0; i < commands.length; i++) {
            int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tmp);

            answer[i] = tmp[commands[i][2] - 1];
        }

        return answer;
    }
}

public class KthNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();

        System.out.println(Arrays.toString(s1.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}

package Java.Programmers.Year2025.Mon03.Day0319;

// Title : 두 개 뽑아서 더하기
// Q. 정수 배열 numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하는 solutino 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    int[] solution (int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!list.contains(numbers[i] + numbers[j]))
                    list.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}

public class SumPickedTwo {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new int[] {2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(s3.solution(new int[] {5, 0, 2, 7})));
    }
}

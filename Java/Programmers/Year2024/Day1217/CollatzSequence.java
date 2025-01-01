package Java.Programmers.Year2024.Day1217;

// Title : 콜라츠 수열
// Q. 모든 자연수 x에 대해 현재 값이 x이면, x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계싼을 계쏙해서 반복하면 언젠가는 반드시 1이 되는지 묻는 문제 = 콜라츠 문제
// Q. 위 과정에서 거쳐간 무든 수를 기록 한 수열 = 콜라츠 수열
// Q. 임의의 1000보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    int[] solution (int n) {
        List<Integer> list = new ArrayList<>();

        list.add(n);
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            list.add(n);
        }
        return list.stream().mapToInt(i -> i).toArray();


        // 배열 리턴
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
    }
}

public class CollatzSequence {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(10)));
    }
}

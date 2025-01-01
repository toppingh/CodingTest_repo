package Java.Programmers.Year2024.Day1218;

// Title : 약수 구하기
// Q. 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    int[] solution (int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }

//        return list.stream().mapToInt(x -> x).toArray();

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class Aliquot{
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(24)));
        System.out.println(Arrays.toString(s4.solution(29)));
    }
}

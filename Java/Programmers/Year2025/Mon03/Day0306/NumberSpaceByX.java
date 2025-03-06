package Java.Programmers.Year2025.Mon03.Day0306;

// Title : x만큼 간격이 있는 n개의 숫자
// Q. x의 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트 return 하는 solution 함수
// Q. x는 -10000000 이상, 10000000 이하인 정수
// Q. n은 1000 이하인 자연수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    long[] solution (int x, int n) {
        List<Long> list = new ArrayList<>();

        for (int i = 1; i <= n; i ++) {
            list.add((long) x * i);
        }

        long[] answer = new long[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

// SolutionCode
class SolutionCode1 {
    long[] solution (int x, int n) {
        long[] answer=  new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}

public class NumberSpaceByX {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        SolutionCode1 sc1 = new SolutionCode1();

        System.out.println(Arrays.toString(s1.solution(2, 5)));
        System.out.println(Arrays.toString(s1.solution(4, 3)));
        System.out.println(Arrays.toString(s1.solution(-4, 2)));
        System.out.println();
        System.out.println(Arrays.toString(sc1.solution(2, 5)));
        System.out.println(Arrays.toString(sc1.solution(4, 3)));
        System.out.println(Arrays.toString(sc1.solution(-4, 2)));
    }
}

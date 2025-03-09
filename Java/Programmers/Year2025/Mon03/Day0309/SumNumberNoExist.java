package Java.Programmers.Year2025.Mon03.Day0309;

// Title : 없는 숫자 더하기
// Q. 0부터 9까지 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어진다.
// Q. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 더한 수를 return 하는 solution 함수

class Solution2 {
    int solution (int[] numbers) {
        int[] answer = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            answer[numbers[i]]++;
        }

        int cnt = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) cnt += i;
        }

        return cnt;
    }
}

// SolutionCode -> 0 ~ 9의 합에서 빼기
class SolutionCode2 {
    int solution (int[] numbers) {
        int sum = 45; // 0 ~ 9까지의 합

        for (int i : numbers) {
            sum -= i;
        }

        return sum;
    }
}

public class SumNumberNoExist {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(s2.solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(s2.solution(new int[] {5, 8, 4, 0, 6, 7, 9}));
        System.out.println();
        System.out.println(sc2.solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(sc2.solution(new int[] {5, 8, 4, 0, 6, 7, 9}));
    }
}

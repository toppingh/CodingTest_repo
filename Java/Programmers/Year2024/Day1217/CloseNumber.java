package Java.Programmers.Year2024.Day1217;

// Title : 가까운 수
// Q. 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return하는 solution 함수

class Solution6 {
    int solution (int[] array, int n) {
        int answer = array[0];

        for (int i : array) {
            if (Math.abs(n - i) < Math.abs(n - answer) ||
            (Math.abs(n - i) == Math.abs(n - answer) && i < answer)) {
                answer = i;
            }
        }
        return answer;
    }
}

public class CloseNumber {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution(new int[]{3, 10, 28}, 20));
        System.out.println(s6.solution(new int[]{10, 11, 12}, 13));
    }
}

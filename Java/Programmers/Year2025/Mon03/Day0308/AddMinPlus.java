package Java.Programmers.Year2025.Mon03.Day0308;

// Title : 음양 더하기
// Q. 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 boolean 배열 signs가 매개변수로 주어진다.
// Q. 실제 정수들의 합을 구하여 return 하는 solution 함수

class Solution1 {
    int solution (int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}

public class AddMinPlus {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {4, 7, 12}, new boolean[] {true, false, true}));
        System.out.println(s1.solution(new int[] {1, 2, 3}, new boolean[] {false, false, true}));
    }
}

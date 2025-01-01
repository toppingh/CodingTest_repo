package Java.Programmers.Year2024.Day1212;

// Title : 주사위의 개수
// Q. 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리 길이 정수 n이 매개변수로 주어질 때, 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하는 solution 함수

class Solution1 {
    int solution (int[] box, int n) {
        int answer = 1;

        for (int i = 0; i < box.length; i++) {
            answer *= box[i] / n;
        }
        return answer;
    }
}

public class CntOfDice {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {1, 1, 1}, 1));
        System.out.println(s1.solution(new int[] {10, 8, 6}, 3));
    }
}

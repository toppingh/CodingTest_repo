package Java.Programmers.Year2025.Day0103;

// Title : 캐릭터의 좌표
// Q. up을 누르면 [0, 1], down을 누르면 [0, -1], left를 누르면 [-1, 0], right를 누르면 [1, 0]이다.
// Q. 입력한 방향키의 배열 keyinput과 맵의 크기 board가 매개변수로 주어질 때, 캐릭터는 항상 [0, 0]에서 시작할 때 키 입력이 모두 끝난 뒤의 캐릭터 좌표 [x, y]를 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int rangeX = board[0] / 2, rangeY = board[1] / 2;

        for (String s : keyinput) {
            switch (s) {
                case "left" :
                    if (answer[0] > -rangeX) answer[0]--;
                    break;
                case "right" :
                    if (answer[0] < rangeX) answer[0]++;
                    break;
                case "up" :
                    if (answer[1] < rangeY) answer[1]++;
                    break;
                case "down" :
                    if (answer[1] > -rangeY) answer[1]--;
                    break;
            }
        }
        return answer;
    }
}


public class CoordinatesOfCharacter {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new String[] {"left", "right", "up", "right", "right"}, new int[] {11, 11})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"down", "down", "down", "down", "down"}, new int[] {7, 9})));
    }
}

package Java.Programmers.Year2025.Mon05.Day0511;

// Title : 키패드 누르기
// Q. 왼손 엄지는 * 키패드에, 오른손 엄지는 # 키패드 위치에서 시작하며 아래 규칙을 따라 엄지를 사용한다.
// 1. 엄지는 상하좌우 4가지 방향으로만 이동하며 한 칸은 1에 해당한다.
// 2. 왼쪽 열 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지를 사용한다.
// 3. 오른쪽 열 3개의 숫자 3, 6, 9를 입력할 때는 오른쪽 엄지를 사용한다.
// 4. 가운데 열 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지의 현재 키패드 위치에서 더 가까운 엄지를 사용한다.
// 4-1. 만약 거리가 같으면, 오른손 잡이는 오른쪽, 왼손 잡이는 왼쪽 엄지를 사용한다.
// Q. 순서대로 누를 번호가 담긴 배열 numbers, 외손/오른손잡이인지 나타내는 문자열 hand가 매개변수로 주어진다.
// Q. 이 때 각 번호를 누른 엄지가 왼손인 지, 오른손인 지 나타내는 연속된 문자열을 return 하는 solution 함수

class Solution1 {
    String solution (int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int[][] KEYPAD = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
        int[] left = {3, 0};
        int [] right = {3, 2};

        for (int i : numbers) {
            if (i == 1 || i == 4 || i == 7) {
                sb.append("L");
                left = KEYPAD[i];
            } else if (i == 3 || i == 6 || i == 9) {
                sb.append("R");
                right = KEYPAD[i];
            } else {
                int diffL = Math.abs(left[0] - KEYPAD[i][0]) + Math.abs(left[1] - KEYPAD[i][1]);
                int diffR = Math.abs(right[0] - KEYPAD[i][0]) + Math.abs(right[1] - KEYPAD[i][1]);

                if (diffL < diffR || (diffL == diffR && hand.equals("left"))) {
                    sb.append("L");
                    left = KEYPAD[i];
                } else {
                    sb.append("R");
                    right = KEYPAD[i];
                }
            }
        }

        return sb.toString();

    }
}

public class PushKeypad {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(s1.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(s1.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
}

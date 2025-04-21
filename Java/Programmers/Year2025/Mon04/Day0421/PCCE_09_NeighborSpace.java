package Java.Programmers.Year2025.Mon04.Day0421;

// Title : [PCCE 기출문제] 9번 / 이웃한 칸
// Q. 보드의 각 칸에 칠해진 색깔 이름이 담긴 2차원 문자열 리스트 board와 고른 칸의ㅣ 위치를 나타내는 두 정수 h, w가 주어질 때 board[h][w]와 이웃한 칸들 중
// Q. 같은 색으로 칠해져 있는 칸의 개수를 return 하는 solution 함수

// Q. 이웃한 칸들 중 몇 개의 칸이 같은 색으로 색칠되어 있는지 확인하는 과정은 아래와 같다.
// 1. 정수를 저장할 변수 n을 만들고 board 길이를 저장한다.
// 2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장한다.
// 3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장한다.
// 4. 반복문으로 i 값을 0부터 3까지 1씩 증가시켜 아래 작업을 반복한다.
// 4-1. 체크할 칸의 h, w 좌표를 나타내는 변수  h_check, w_check를 만들어 각각 h + dh[i], w + dw[i]를 저장한다.
// 4-2. h_check가 0이상 n미만이고 w_check가 0이상 n미만이면 아래를 수행한다.
// 4-2-1. board[h][w]와 board[h_check][w_check]의 값이 동일하면 count 값을 1 증가 시킨다.
// 5. count 값을 return 한다.

import java.util.Objects;

class Solution1 {
    int solution (String[][] board, int h, int w) {
        int cnt = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i <= 3; i++) {
            if ((h + dh[i] >= 0 && h + dh[i] < board.length) && w + dw[i] >= 0 && w + dw[i] < board.length) {
                if (Objects.equals(board[h][w], board[h + dh[i]][w + dw[i]])) cnt++;
            }
        }
        return cnt;
    }
}

public class PCCE_09_NeighborSpace {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new String[][] {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1));
        System.out.println(s1.solution(new String[][] {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1));
    }
}

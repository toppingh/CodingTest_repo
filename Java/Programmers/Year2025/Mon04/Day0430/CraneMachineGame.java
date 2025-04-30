package Java.Programmers.Year2025.Mon04.Day0430;

// Title : 크레인 인형뽑기 게임
// Q. 크레인을 움직여 가장 위에 있는 인형을 집어 올릴 수 있고, 이 인형은 바구니의 가장 아래 칸부터 인형이 순서대로 쌓인다.
// Q. 같은 모양의 인형 두 개가 바구니에 쌓이면 터지면서 바구니에서 사라지게 된다.
// Q. 인형이 없는 곳에서 크레인 작동시 아무 일도 일어나지 않는다.
// Q. 게임 화면의 격자 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동 시킨 위치가 담긴 배열 moves가 매개변수로 주어진다.
// Q. 이때 크레인을 모두 작동시킨 후 터져서 사라진 인형의 개수를 return 하는 solution 함수

import java.util.ArrayDeque;
import java.util.Deque;

class Solution1 {
    int solution (int[][] board, int[] moves) {
        Deque<Integer> deque = new ArrayDeque<>();
        int cnt = 0;

        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                int pick = board[j][i - 1];

                if (pick != 0) {
                    board[j][i - 1] = 0;

                    if (!deque.isEmpty() && deque.peek() == pick) {
                        deque.pop();
                        cnt += 2;
                    } else {
                        deque.push(pick);
                    }

                    break;
                }
            }
        }
        return cnt;
    }
}

public class CraneMachineGame {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[] {1, 5, 3, 5, 1, 2, 1, 4}));
    }
}

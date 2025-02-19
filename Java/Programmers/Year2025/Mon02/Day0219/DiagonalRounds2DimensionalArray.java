package Java.Programmers.Year2025.Mon02.Day0219;

// Title : 이차원 배열 대각선 순회하기
// Q. i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수

class Solution4 {
    int solution (int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) answer += board[i][j];
            }
        }

        return answer;
    }
}

public class DiagonalRounds2DimensionalArray {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(new int[][] {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2));
    }
}

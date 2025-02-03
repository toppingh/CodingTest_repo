package Java.Programmers.Year2025.Mon01.Day0108;

// Title : 안전지대
// Q. 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하는 solution 함수

// https://eunzzzzz1.tistory.com/4 참고
class Solution3 {
    int solution (int[][] board) {
        int cnt = 0;
        int[][] tmp = new int[board.length + 2][board.length + 2]; // 액자용 배열, 단순 조건식으로 안전 영역 구하기 가능 (길이 + 2)

        // 1. tmp에 board 복사
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board.length + 1; j++) {
                tmp[i][j] = board[i - 1][j - 1];
            }
        }

        // 2. 위험 지대 찾기
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board.length + 1; j++) {
                if (tmp[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (tmp[k][l] != 1) tmp[k][l] = 2;
                        }
                    }
                }
            }
        }

        // 3. 안전 지대 카운트
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board.length + 1; j++) {
                if (tmp[i][j] == 0) cnt++;
//                System.out.println(tmp[i][j]);
            }
        }
        return cnt;
    }
}

public class SafeZone {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(s3.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(s3.solution(new int[][] {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}));
    }
}

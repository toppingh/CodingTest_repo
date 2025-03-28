package Java.Programmers.Year2025.Mon03.Day0328;

// Title : 덧칠하기
// Q. 1미터 길이의 구역 을 나눈 정수 n, 벽에 페인트를 칠하는 롤러의 길이 m과 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 sectino이 매개변수로 주어질 때 롤러로 페인트칠해야 하는 최소 횟수를 return 하는 solution 함수
// Q. 롤러의 좌우측 끝을 구역의 경계선 또는 벽의 좌우측 끝부분에 맞춘 후 롤러를 위아래로 움직여 벽을 칠한다.
// Q. 현재 페인트를 칠하는 구역들을 완전히 칠한 후 벽에서 롤러를 떼면 한 번 칠했다고 정의 한다.

class Solution2 {
    int solution (int n, int m, int[] section) {
        int cnt = 0, end = 0;

        for (int j : section) {
            if (j > end) {
                cnt++;
                end = j + m - 1;
            }
        }
        return cnt;
    }
}

public class OverPainting {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(8, 4, new int[] {2, 3, 6}));
        System.out.println(s2.solution(5, 4, new int[] {1, 3}));
        System.out.println(s2.solution(4, 1, new int[] {1, 2, 3, 4}));
    }
}

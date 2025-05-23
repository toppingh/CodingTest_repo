package Java.Programmers.Year2025.Mon01.Day0121;

// Title : 평행
// Q. [[x1, y1], [x2, y2], [x3, y3], [x4, y4]] 좌표를 담은 이차원 배열 dots가 매개변수로 주어진다.
// Q. 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1, 없으면 0을 return 하는 solution 함수

class Solution4 {
    int solution (int[][] dots) {

        double m1 = (double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double m2 = (double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);

        if (Double.isInfinite(m1) || Double.isInfinite(m2) || m1 == m2) {
            return 1;
        }

        double m3 = (double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        double m4 = (double) (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);

        if (Double.isInfinite(m3) || Double.isInfinite(m4) || m3 == m4) {
            return 1;
        }

        return 0;
    }
}

public class Parallel {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(s4.solution(new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }
}

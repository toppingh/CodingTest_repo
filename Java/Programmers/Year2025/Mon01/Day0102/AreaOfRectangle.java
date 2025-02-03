package Java.Programmers.Year2025.Mon01.Day0102;

// Title : 직사각형 넓이 구하기
// Q. 직사각형 네 꼭짓점의 좌료 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int solution (int[][] dots) {
        int[] x = {dots[0][0], dots[1][0], dots[2][0], dots[3][0]};
        int[] y = {dots[0][1], dots[1][1], dots[2][1], dots[3][1]};

        Arrays.sort(x);
        Arrays.sort(y);

        return (x[3] - x[0]) * (y[3] - y[0]);
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[][] {{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(s1.solution(new int[][] {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }
}

package Java.Programmers.Year2025.Mon03.Day0318;

// Title : 최소직사각형
// Q. 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어질 때 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
// Q. 지갑의 크기를 return 하는 solution 함수

class Solution1 {
    int solution (int[][] sizes) {
        int w = 0;
        int h = 0;

        for (int i = 0; i < sizes.length; i++) {
            w = Math.max(w, Math.max(sizes[i][0], sizes[i][1])); // 가장 긴 변
            h = Math.max(h, Math.min(sizes[i][0], sizes[i][1])); // 가자 짧은 변 중 긴 변
        }

        return w * h;
    }
}

public class MiniSquare {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(s1.solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(s1.solution(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
}

package Java.Programmers.Year2025.Mon02.Day0203;

// Title : 겹치는 선분의 길이
// Q. 선분 3개가 평행하게 놓여있을 때, 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어진다.
// Q. 두 개 이상의 선문이 겹치는 부분의 길이를 return하는 solution 함수

class Solution2 {
    int solution (int[][] lines) {
        int answer = 0;
        int[] cnt = new int[201];

        for (int[] i : lines) {
            for (int j = i[0] + 100; j < i[1] + 100; j++) {
                cnt[j]++;
            }
        }

        for (int i : cnt) {
            if (i > 1) answer++;
        }
        return answer;
    }
}

// SolutionCode -> 배열 생성 없이 풀이
class SolutionCode2 {
    int solution (int[][] lines) {
        int answer = 0;
        for (int i = -100; i < 100; i++) {
            int line = 0;

            if (lines[0][0] <= i && lines[0][1] > i) line++;
            if (lines[1][0] <= i && lines[1][1] > i) line++;
            if (lines[2][0] <= i && lines[2][1] > i) line++;

            if (line > 1) answer++;
        }
        return answer;
    }
}

public class OverlappingLength {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(s2.solution(new int[][] {{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(s2.solution(new int[][] {{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(s2.solution(new int[][] {{0, 5}, {3, 9}, {1, 10}}));
        System.out.println();
        System.out.println(sc2.solution(new int[][] {{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(sc2.solution(new int[][] {{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(sc2.solution(new int[][] {{0, 5}, {3, 9}, {1, 10}}));
    }
}

package Java.Programmers.Year2025.Mon01.Day0114;

// Title : 삼각형의 완성조건 (2)
// Q. 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 작다.
// Q. 삼각형 두 변의 길이가 담긴 배열 sides가 매개변수로 주어질 때, 나머지 한 변이 될 수 있는 정수의 개수를 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int solution(int[] sides) {
        int cnt = 0;
        Arrays.sort(sides);

        for (int i = sides[1] - sides[0] + 1; i < sides[0] + sides[1]; i++) {
            cnt++;
        }
        return cnt;
    }
}

// SolutionCode1 -> 작은 값 활용하기
class SolutionCode1 {
    int solution(int[] sides) {
        int answer = 0;
        answer += Math.min(sides[0], sides[1]) * 2 - 1;

        return answer;
    }
}

public class CaseOfTriangle {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        SolutionCode1 sc1 = new SolutionCode1();

        System.out.println(s1.solution(new int[] {1, 2}));
        System.out.println(s1.solution(new int[] {3, 6}));
        System.out.println(s1.solution(new int[] {11, 7}));
        System.out.println();
        System.out.println(sc1.solution(new int[] {1, 2}));
        System.out.println(sc1.solution(new int[] {3, 6}));
        System.out.println(sc1.solution(new int[] {11, 7}));
    }
}

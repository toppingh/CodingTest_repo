package Java.Programmers.Year2024.Day1216;

// Title : 삼각형의 완성조건(1)
// Q. 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 한다 -> 조건 만족시 삼각형
// Q. 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어질 때, 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하는 solution 함수

import java.util.Arrays;

class Solution3 {
    int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}

public class TriangleCase1 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[] {1, 2, 3}));
        System.out.println(s3.solution(new int[] {3, 6, 2}));
        System.out.println(s3.solution(new int[] {199, 72, 222}));
    }
}

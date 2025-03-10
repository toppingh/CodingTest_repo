package Java.Programmers.Year2025.Mon03.Day0310;

// Title : 내적
// Q. 길이가 같은 두 1차원 정수 배열 a, b가 주어질 때 a와 b의 내적을 return 하는 solution 함수
// Q. 이 떄, a와 b의 내적은 a[0] * b[0] + a[1] * b[1] ... + a[n-1] * b[n-1] 이다.

class Solution2 {
    int solution (int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}

public class DotProduct {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {1, 2, 3, 4}, new int[] {-3, -1, 0, 2}));
        System.out.println(s2.solution(new int[] {-1, 0, 1}, new int[] {1, 0, -1}));
    }
}

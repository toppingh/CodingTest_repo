package Java.Programmers.Year2024.Day1212;

// Title : 팩토리얼
// Q. i 팩토리얼(i!)은 1부터 i까지 정수의 곱을 의미합니다. ex. 5! = 5 * 4 * 3 * 2 * 1 = 120.
// Q. 정수 n이 주어질 때 i <= n 조건을 만족하는 가장 큰 정수 i를 return 하는 solution 함수

class Solution3 {
    int solution (int n) {
        int answer = 1;

        for (int i = 1; i <= n; i++) {

            answer *= i;

            if (answer > n) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}

// SolutionCode - While문으로 바꿔보기
class SolutionCode3 {
    int solution (int n) {
        int answer = 1;

        int i = 1;
        while (i <= n) {
            answer++;
            i *= answer;
        }
        return answer - 1;
    }
}

public class Factorial {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        SolutionCode3 sc3 = new SolutionCode3();

        System.out.println(s3.solution(3628800));
        System.out.println(s3.solution(7));
        System.out.println(sc3.solution(3628800));
        System.out.println(sc3.solution(7));
    }
}

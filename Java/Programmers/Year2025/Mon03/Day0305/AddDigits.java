package Java.Programmers.Year2025.Mon03.Day0305;

// Title : 자릿수 더하기
// Q. 자연수 n이 주어지면 n의 각 자릿수의 합을 구해 return 하는 solution 함수

class Solution4 {
    int solution (int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

public class AddDigits {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(123));
        System.out.println(s4.solution(987));
    }
}

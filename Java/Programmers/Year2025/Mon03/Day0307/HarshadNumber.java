package Java.Programmers.Year2025.Mon03.Day0307;

// Title : 하샤드 수
// Q. 양의 정수 x가 하샤드 수이려면 x의 자릿수 합으로 x가 나누어져야 한다. x가 하샤드 수인지 아닌지 검사하는 solution 함수

class Solution3 {
    boolean solution (int x) {
        int sum = 0, tmp = x;

        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }

        return x % sum == 0;
    }
}

public class HarshadNumber {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(10));
        System.out.println(s3.solution(12));
        System.out.println(s3.solution(11));
        System.out.println(s3.solution(13));
    }
}

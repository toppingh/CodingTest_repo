package Java.Programmers.Year2025.Mon03.Day0305;

// Title : 약수의 합
// Q. 정수 n을 입력받아 n의 약수를 모두 더한 값을 return 하는 solution 함수

import java.util.Scanner;

class Solution3 {
    int solution (int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution3 s3 = new Solution3();

        int n = sc.nextInt();
        System.out.println(s3.solution(n));

    }
}

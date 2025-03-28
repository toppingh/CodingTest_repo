package Java.Programmers.Year2025.Mon03.Day0328;

// Title : 소수 찾기
// Q. 1부터 입력받은 숫자 n사이에 있는 소수의 개수를 return 하는 solution 함수

import java.util.ArrayList;
import java.util.List;

class Solution3 {
    int solution (int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) list.add(i);
        }

        return list.size();
    }
}

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(10));
        System.out.println(s3.solution(5));
    }
}

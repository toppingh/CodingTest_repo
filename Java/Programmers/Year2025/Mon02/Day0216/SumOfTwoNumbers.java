package Java.Programmers.Year2025.Mon02.Day0216;

// Title : 두 수의 합
// Q. 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b 값을 문자열로 return 하는 solution 함수

import java.math.BigInteger;

class Solution2 {
    String solution (String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        return "" + numA.add(numB);
    }
}

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("582", "734"));
        System.out.println(s2.solution("18446744073709551615", "287346502836570928366"));
        System.out.println(s2.solution("0", "0"));
    }
}

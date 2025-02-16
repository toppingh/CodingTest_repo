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

// SolutionCode -> 반복문 활용
class SolutionCode2 {
    String solution (String a, String b) {
        StringBuilder sb = new StringBuilder();

        int carry = 0; // 올림수 저장 변수
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) { // 남은 올림수가 없을 때까지
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0'; // a 문자열 뒤에서부터 하나씩
            if (j >= 0) sum += b.charAt(j--) - '0'; // b 문자열 뒤에서부터 하나씩
            sb.append(sum % 10); // 자릿수 값 추가
            carry = sum / 10; // 올림수 계산
        }
        // 결과는 뒤집어서 반환
        return sb.reverse().toString();
    }
}

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(s2.solution("582", "734"));
        System.out.println(s2.solution("18446744073709551615", "287346502836570928366"));
        System.out.println(s2.solution("0", "0"));
        System.out.println();
        System.out.println(sc2.solution("582", "734"));
        System.out.println(sc2.solution("18446744073709551615", "287346502836570928366"));
        System.out.println(sc2.solution("0", "0"));
    }
}

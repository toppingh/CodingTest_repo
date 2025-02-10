package Java.Programmers.Year2025.Mon02.Day0210;

// Title : 2진수 더하기
// Q. 이진수를 의미하는 두 개의 문자열 bin1, bin2가 매개변수로 주어질 때 두 이진수의 합을 return하는 solution 함수

class Solution5 {
    String solution (String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}

public class SumToBinary {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("10", "11"));
        System.out.println(s5.solution("1001", "1111"));
    }
}

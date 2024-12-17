package Java.Programmers.Day1217;

// Title : 암호 해독
// Q. 암호화된 문자열 cipher를 주고받을 때 code의 배수 번째 글자만 진짜 암호.
// Q. 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하는 solution 함수

class Solution8 {
    String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}

public class CodeDecryption {
    public static void main(String[] args) {
        Solution8 s8 = new Solution8();
        System.out.println(s8.solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(s8.solution("pfqallllabwaoclk", 2));
    }
}

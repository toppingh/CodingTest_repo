package Java.Programmers.Year2025.Day0108;

// Title : qr code
// Q. 두 정수 q, r과 문자열 code가 주어질 때 code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터
// Q. 순서대로 이어 붙인 문자열을 return 하는 solution 함수

class Solution1 {
    String solution (int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = r; i < code.length(); i += q) {
            sb.append(code.charAt(i));
        }
        return sb.toString();
    }
}

public class qrCode {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(s1.solution(1, 0, "programmers"));
    }
}

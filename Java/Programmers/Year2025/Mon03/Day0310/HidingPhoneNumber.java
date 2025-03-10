package Java.Programmers.Year2025.Mon03.Day0310;

// Title : 핸드폰 번호 가리기
// Q. 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호 뒷 4자리를 제외한 나머지 숫자를 전부 *로 가린 문자열을 return 하는 solution 함수

class Solution1 {
    String solution (String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }
}

// SolutionCode - for문 활용
class SolutionCode1 {
    String solution (String phone_number) {
        char[] ch = phone_number.toCharArray();

        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }
}

public class HidingPhoneNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        SolutionCode1 sc1 = new SolutionCode1();

        System.out.println(s1.solution("01033334444"));
        System.out.println(s1.solution("027778888"));
        System.out.println();
        System.out.println(sc1.solution("01033334444"));
        System.out.println(sc1.solution("027778888"));
    }
}

package Java.Programmers.Year2025.Mon03.Day0310;

// Title : 가운데 글자 가져오기
// Q. 단어 s의 가운데 글자를 변환하는 solution 함수 (단어의 길이가 짝수면 가운데 두 글자 return)

class Solution3 {
    String solution (String s) {
        return s.length() % 2 != 0 ? "" + s.charAt(s.length() / 2) : "" + (s.charAt(s.length() / 2 - 1)) + s.charAt(s.length() / 2);
    }
}

public class BringMiddleLetter {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("abcde"));
        System.out.println(s3.solution("qwer"));
    }
}

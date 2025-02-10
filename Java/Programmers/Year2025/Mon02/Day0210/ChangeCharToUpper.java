package Java.Programmers.Year2025.Mon02.Day0210;

// Title : 특정한 문자를 대문자로 바꾸기
// Q. 소문자로 이루어진 my_string과 1글자로 이루어진 문자열 alp가 주어질때, my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수

class Solution3 {
    String solution (String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}

public class ChangeCharToUpper {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("programmers", "p"));
        System.out.println(s3.solution("lowercase", "x"));
    }
}

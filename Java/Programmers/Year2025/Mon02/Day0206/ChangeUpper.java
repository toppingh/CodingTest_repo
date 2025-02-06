package Java.Programmers.Year2025.Mon02.Day0206;

// Title : 대문자로 바꾸기
// Q. 알파벳으로 이루어진 문자열 myString의 모든 알파벳을 대문자로 변환하여 return하는 solution 함수

class Solution5 {
    String solution (String myString) {
        return myString.toUpperCase();
    }
}

public class ChangeUpper {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("aBcDeFg"));
        System.out.println(s5.solution("AAA"));
    }
}

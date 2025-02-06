package Java.Programmers.Year2025.Mon02.Day0206;

// Title : 소문자로 바꾸기
// Q. 알파벳으로 이루어진 문자열 myString이 주어질 떄, 모든 알파벳을 소문자로 변환해 return 하는 solution 함수

class Solution6 {
    String solution (String myString){
        return myString.toLowerCase();
    }
}

public class ChangeLower {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution("aBcDeFg"));
        System.out.println(s6.solution("aaa"));
    }
}

package Java.Programmers.Year2025.Mon02.Day0211;

// Title : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
// Q. 문자열 myString과 pat가 주어진다. myString의 부분 문자열 중  pat로 끝나는 가장 긴 부분 문자열을 찾아 return 하는 solution 함수

class Solution1 {
    String solution (String myString, String pat) {
            return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}

public class FindStrongestString {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("AbCdEFG", "dE"));
        System.out.println(s1.solution("AAAAaaaa", "a"));
    }
}

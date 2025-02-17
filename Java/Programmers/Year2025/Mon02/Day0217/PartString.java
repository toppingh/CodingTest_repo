package Java.Programmers.Year2025.Mon02.Day0217;

// Title : 부분 문자열
// Q. 문자열 str1이 str2의 부분 문자열이라면 1, 아니면 0을 return 하는 solution 함수

class Solution1 {
    int solution (String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}

public class PartString {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("abc", "aabcc"));
        System.out.println(s1.solution("tbt", "tbbttb"));
    }
}

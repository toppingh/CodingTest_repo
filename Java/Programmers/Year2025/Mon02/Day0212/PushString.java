package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 문자열 밀기
// Q. A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return한다.
// Q. 밀어서 B가 될 수 없으면 -1을 return하는 solution 함수

class Solution6 {
    int solution (String A, String B) {
        return (B + B).indexOf(A);
    }
}

public class PushString {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution("hello", "ohell"));
        System.out.println(s6.solution("apple", "elppa"));
        System.out.println(s6.solution("atat", "tata"));
        System.out.println(s6.solution("abc", "abc"));
    }
}

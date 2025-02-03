package Java.Programmers.Year2025.Mon01.Day0107;

// Title : 문자열의 앞의 n글자
// Q. 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞 n글자로 이루어진 문자열을 return하는 solution 함수

class Solution1 {
    String solution (String my_string, int n) {
        return my_string.substring(0, n);
    }
}

public class FrontOfLetterN {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("ProgrammerS123", 11));
        System.out.println(s1.solution("He110W0r1d", 5));
    }
}

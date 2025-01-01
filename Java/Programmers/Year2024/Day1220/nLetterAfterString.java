package Java.Programmers.Year2024.Day1220;

// Title : 문자열의 뒤의 n글자
// Q. 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return하는 solution 함수

class Solution5 {
    String solution (String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}


public class nLetterAfterString {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("ProgrammerS123", 11));
        System.out.println(s5.solution("He110W0r1d", 5));
    }
}

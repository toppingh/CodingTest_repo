package Java.Programmers.Year2025.Mon02.Day0212;

// Title : my_string
// Q. 문자열 rny_string이 주어질때 rny_string의 모든 m을 rn으로 바꾼 문자열을 return하는 solution 함수

class Solution5 {
    String solution (String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}

public class my_string {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("masterpiece"));
        System.out.println(s5.solution("programmers"));
        System.out.println(s5.solution("jerry"));
        System.out.println(s5.solution("burn"));
    }
}

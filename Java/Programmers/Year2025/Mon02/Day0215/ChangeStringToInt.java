package Java.Programmers.Year2025.Mon02.Day0215;

// Title : 문자열을 정수로 변환하기
// Q. 숫자로 이루어진 문자열 n_str이 주어질 때 n_str을 정수로 변환해 return 하는 solution 함수

class Solution5 {
    int solution (String n_str) {
        return Integer.parseInt(n_str);
    }
}

public class ChangeStringToInt {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("10"));
        System.out.println(s5.solution("8542"));
    }
}

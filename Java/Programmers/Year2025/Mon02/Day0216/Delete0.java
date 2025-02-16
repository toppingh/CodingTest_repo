package Java.Programmers.Year2025.Mon02.Day0216;

// Title : 0 떼기
// Q. 정수로 이루어진 문자열 n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return 하는 solution 함수

class Solution1 {
    String solution (String n_str) {
        return n_str.replaceAll("^0+", "");
    }
}

// SolutionCode1 -> 정수로 변환 후 다시 문자열로 return
class SolutionCode1 {
    String solution (String n_str) {
        return "" + Integer.parseInt(n_str);
    }
}

public class Delete0 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        SolutionCode1 sc1 = new SolutionCode1();

        System.out.println(s1.solution("0010"));
        System.out.println(s1.solution("854020"));
        System.out.println();
        System.out.println(sc1.solution("0010"));
        System.out.println(sc1.solution("854020"));
    }
}

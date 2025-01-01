package Java.Programmers.Year2024.Day1218;

// Title : 간단한 논리 연산
// Q. boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, true/false를 return하는 solution 함수
// Q. (x1 ∨ x2) ∧ (x3 ∨ x4)

class Solution5 {
    boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}

public class SimpleLogicalOperation {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(false, true, true, true));
        System.out.println(s5.solution(true, false, false, false));
    }
}

package Java.Programmers.Year2025.Mon03.Day0305;

// Title : 문자열을 정수로 바꾸기
// Q. 문자열 s를 숫자로 변환한 결과를 반환하는 solution 함수

class Solution2 {
    int solution (String s) {
        return Integer.parseInt(s);
    }
}

public class ChangeStringToInt {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("-1234"));
    }
}

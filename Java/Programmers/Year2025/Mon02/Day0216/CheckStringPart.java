package Java.Programmers.Year2025.Mon02.Day0216;

// Title : 부분 문자열인지 확인하기
// Q. target이 문자열 my_string의 문자열이면 1 아니면 0을 return 하는 solution 함수

class Solution5 {
    int solution (String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}

public class CheckStringPart {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("banana", "ana"));
        System.out.println(s5.solution("banana", "wxyz"));
    }
}

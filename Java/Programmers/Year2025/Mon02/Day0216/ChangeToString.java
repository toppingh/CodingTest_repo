package Java.Programmers.Year2025.Mon02.Day0216;

// Title : 문자열로 변환
// Q. 정수 n을 문자열로 변환해 return 하는 solution 함수

class Solution3 {
    String solution (int n) {
//        return "" + n;
        return String.valueOf(n); // 속도는 이게 더 빠름
    }
}

public class ChangeToString {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(123));
        System.out.println(s3.solution(2573));
    }
}

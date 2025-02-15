package Java.Programmers.Year2025.Mon02.Day0215;

// Title : 정수 부분
// Q. 실수 flo가 매개변수 일 때 flo의 정수 부분을 return 하는 solution 함수

class Solution3 {
    int solution (double flo) {
        return (int) flo;
    }
}

public class PartOfInt {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(1.42));
        System.out.println(s3.solution(69.32));
    }
}

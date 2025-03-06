package Java.Programmers.Year2025.Mon03.Day0306;

// Title : 나머지가 1이 되는 수 찾기
// Q. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하는 solution 함수

class Solution2 {
    int solution (int n) {
        int answer = 1;
        while (n % answer != 1) {
            answer++;
        }
        return answer;
    }
}

public class FindRemain1 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(10));
        System.out.println(s2.solution(12));
    }
}

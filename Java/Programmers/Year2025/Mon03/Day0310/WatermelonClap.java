package Java.Programmers.Year2025.Mon03.Day0310;

// Title : 수박수박수박수박수박수?
// Q. 길이가 n이고, 수박수박수박수... 같은 패턴을 유지하는 문자열을 return 하는 solution 함수
// Q. ex) n = 4이면 수박수박 return, n = 3이면 수박수 return

class Solution4 {
    String solution (int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }

        return sb.toString();
    }
}

public class WatermelonClap {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(3));
        System.out.println(s4.solution(4));
    }
}

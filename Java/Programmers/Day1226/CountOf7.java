package Java.Programmers.Day1226;

// Title : 7의 개수
// Q. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는 지 return하는 solution 함수

class Solution1 {
    int solution (int[] array) {
        int cnt = 0;
        for (int i : array) {
            String str = Integer.toString(i);

            for (char c : str.toCharArray()) {
                if (c == '7') cnt++;
            }
        }
        return cnt;
    }
}

public class CountOf7 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {7, 77, 17}));
        System.out.println(s1.solution(new int[] {10, 29}));
    }
}

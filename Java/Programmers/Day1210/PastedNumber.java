package Java.Programmers.Day1210;

// Title : 이어붙인 수
// Q. 정수가 담긴 리스트 num_list가 주어질 때 num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return 하는 solution 함수

class Solution1 {
    int solution(int[] num_list) {
        StringBuilder evenSb = new StringBuilder();
        StringBuilder oddSb = new StringBuilder();


        for(int i : num_list) {
            (i % 2 == 0 ? evenSb : oddSb).append(i);
        }
        return Integer.valueOf(String.valueOf(evenSb)) + Integer.valueOf(String.valueOf(oddSb));
    }
}

public class PastedNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(s1.solution(new int[]{5, 7, 8, 3}));
    }
}

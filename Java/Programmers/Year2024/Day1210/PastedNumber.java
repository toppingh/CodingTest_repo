package Java.Programmers.Year2024.Day1210;

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

// Solution Code1 - 10을 곱해서 int형 문자열 활용
class SolutionCode1 {
    int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                even *= 10;
                even += i;
            } else {
                odd *= 10;
                odd += i;
            }
        }
        return even + odd;
    }
}

public class PastedNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        SolutionCode1 sc1 = new SolutionCode1();

        System.out.println(s1.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(s1.solution(new int[]{5, 7, 8, 3}));
        System.out.println(sc1.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(sc1.solution(new int[]{5, 7, 8, 3}));
    }
}

package Java.Programmers.Year2025.Mon02.Day0205;

// Title : 1로 만들기
// Q. 정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해 필요한 나누기 연산 횟수를 return하는 solution 함수

class Solution1 {
    int solution (int[] num_list) {
        int answer = 0;

        for(int i : num_list) {
            while (i > 1) {
                if (i % 2 == 0) i /= 2;
                else i = (i - 1) / 2;
                answer++;
            }
        }
        return answer;
    }
}

public class MakeTo1 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {12, 4, 15, 1, 14}));
    }
}

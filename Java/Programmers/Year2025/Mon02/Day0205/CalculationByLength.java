package Java.Programmers.Year2025.Mon02.Day0205;

// Title : 길이에 따른 연산
// Q. 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11이상이면 리스트에 있는 모든 원소의 합을, 10 이하이면 모든 원소의 곱을 return하는 solution 함수

class Solution2 {
    int solution (int[] num_list) {
        int answer = (num_list.length >= 11) ? 0 : 1;

        for (int i : num_list) {
            answer = num_list.length >= 11 ? answer + i : answer * i;
        }
        return answer;
    }
}

public class CalculationByLength {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(s2.solution(new int[] {2, 3, 4, 5}));
    }
}

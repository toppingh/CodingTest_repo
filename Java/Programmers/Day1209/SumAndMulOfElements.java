package Java.Programmers.Day1209;

// Title : 원소들의 곱과 합
// Q. 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1, 크면 0을 return 하는 solution 함수

class Solution3 {
    int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for (int i : num_list) {
            sum += i;
            mul *= i;
        }
        return sum * sum > mul ? 1 : 0;
    }
}

public class SumAndMulOfElements {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(s3.solution(new int[] {5, 7, 8, 3}));
    }
}

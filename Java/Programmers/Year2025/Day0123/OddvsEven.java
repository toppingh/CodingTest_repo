package Java.Programmers.Year2025.Day0123;

// Title : 홀수vs짝수
// Q. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하는 solution 함수
// Q. 두 값이 같을 경우 그 값 return

class Solution1 {
    int solution (int[] num_list) {
        int even = 0, odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i & 1) == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        return Math.max(even, odd);
    }
}

public class OddvsEven {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {4, 2, 6, 1, 7, 6}));
        System.out.println(s1.solution(new int[] {-1, 2, 5, 6, 3}));
    }
}

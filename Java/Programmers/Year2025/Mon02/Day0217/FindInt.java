package Java.Programmers.Year2025.Mon02.Day0217;

// Title : 정수 찾기
// Q. 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list 안에 n이 있으면 1, 없으면 0을 return 하는 solution 함수

class Solution3 {
    int solution (int[] num_list, int n) {
        for (int i : num_list) {
            if (i == n) return 1;
        }
        return 0;
    }
}

public class FindInt {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[] {1, 2, 3, 4, 5}, 3));
        System.out.println(s3.solution(new int[] {15, 98, 23, 2, 15}, 20));
    }
}

package Java.Programmers.Year2025.Day0120;

// Title : 첫 번째로 나오는 음수
// Q. 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return 하는 solution 함수
// Q. 음수가 없다면 -1 return

class Solution1 {
    int solution (int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        return -1;
    }
}

public class FirstNegativeNum {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {12, 4, 15, 46, 38, -2, 15}));
        System.out.println(s1.solution(new int[] {13, 22, 53, 24, 15, 6}));
    }
}

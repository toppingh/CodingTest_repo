package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 다음에 올 숫자
// Q. 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하는 solution 함수

class Solution9 {
    int solution (int[] common) {
        return (common[1] - common[0] == common[2] - common[1]) ?
                common[common.length - 1] + (common[1] - common[0]) :
                common[common.length - 1] * (common[1] / common[0]);
    }
}

public class NextNumber {
    public static void main(String[] args) {
        Solution9 s9 = new Solution9();
        System.out.println(s9.solution(new int[] {1, 2, 3, 4}));
        System.out.println(s9.solution(new int[] {2, 4, 8}));
    }
}

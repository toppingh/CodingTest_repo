package Java.Programmers.Year2025.Mon03.Day0305;

// Title : 평균 구하기
// Q. 정수를 담는 배열 arr의 평균값을 return 하는 solution 함수

class Solution6 {
    double solution (int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        return answer / arr.length;
    }
}

public class Average {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution(new int[] {1, 2, 3, 4}));
        System.out.println(s6.solution(new int[] {5, 5}));
    }
}

package Java.Programmers.Year2025.Mon03.Day0316;

// Title : 삼총사
// Q. 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하는 solution 함수
// Q. 첫, 세, 네 번째 학생의 정수 번호를 더하거나 두, 네, 다섯 번째 학생의 정수 번호를 더해 0이되면 삼초사

class Solution1 {
    int solution (int[] numbers) {
        int cnt = 0;

        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) cnt++;
                }
            }
        }

        return cnt;
    }
}

public class ThreeMusketeers {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {-2, 3, 0, 2, -5}));
        System.out.println(s1.solution(new int[] {-3, -2, -1, 0, 1, 2, 3}));
        System.out.println(s1.solution(new int[] {-1, 1, -1, 1}));
    }

}

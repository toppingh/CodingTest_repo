package Java.Programmers.Day1210;

// Title : 공 던지기
// Q. 친구들의 번호가 들어있는 정수 배열 numbers와 정수 k가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return하는 solution 함수

class Solution3 {
    int solution(int[] numbers, int k) {
        int idx = ((k - 1) * 2) % numbers.length;

        return numbers[idx];
    }
}

public class ThrowBall {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[] {1, 2, 3, 4}, 2));
        System.out.println(s3.solution(new int[] {1, 2, 3, 4, 5, 6}, 5));
    }
}

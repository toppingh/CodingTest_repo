package Java.Programmers.Day1210;

// Title : 배열 회전시키기
// Q. 정수가 담긴 배열 numbers와 문자열 direction이 매개변수로 주어질 때, 배열 numbers의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을 return하는 solution 함수

class Solution4 {
    int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int shift = (direction.equals("right")) ? 1 : numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            int idx = (i + shift) % numbers.length;
            answer[idx] = numbers[i];
        }

        return answer;
    }
}

public class RotationArray {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(new int[] {1, 2, 3}, "right"));
        System.out.println(s4.solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left"));
    }
}

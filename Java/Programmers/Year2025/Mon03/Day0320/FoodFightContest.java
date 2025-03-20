package Java.Programmers.Year2025.Mon03.Day0320;

// Title : 푸드 파이트 대회
// Q. 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어질 때, 대회를 위한 음식으 ㅣ배치를 나타내는 문자열을 return 하는 solution 함수

class Solution3 {
    String solution (int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }

        return sb.toString() + "0" + sb.reverse();
    }
}

public class FoodFightContest {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[] {1, 3, 4, 6}));
        System.out.println(s3.solution(new int[] {1, 7, 1, 2}));
    }
}

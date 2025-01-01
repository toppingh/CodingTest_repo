package me.topping.Programmers.Day1113;

// Title : 머쓱이보다 키 큰 사람
// Q. 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하는 solution 함수
// 제한. 1 <= array의 길이 <= 100, 1 <= height, array의 원소 <= 200

class Solution3 {
    int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= height) answer += 1;
        }
        return answer;
    }
}

public class Taller {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();

        System.out.println(s3.solution(new int[]{149, 189, 192, 179}, 167));
        System.out.println(s3.solution(new int[]{180, 120, 140}, 190));
    }
}

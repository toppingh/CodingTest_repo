package Java.Programmers.Year2025.Mon02.Day0218;

// Title : 사진 확대
// Q. 그림 파일을 나타낸 문자열 배열 picture와 정수 k가 매개변수로 주어질때, 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내는 문자열 배열을 return하는 solution 함수

import java.util.Arrays;

class Solution2 {
    String[] solution (String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();

            // 가로 방향으로 k배 확장
            for (char c : picture[i].toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }

            // 세로 방향으로 k번 복제
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = sb.toString();
            }
        }
        return answer;
    }
}

public class ZoomInPicture {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution(new String[] {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2)));
        System.out.println(Arrays.toString(s2.solution(new String[] {"x.x", ".x.", "x.x"}, 3)));
    }
}

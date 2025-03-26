package Java.Programmers.Year2025.Mon03.Day0326;

// Title : 추억 점수
// Q. 그리워하는 사람의 이름을 담긴 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어진다.
// Q. 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int[] solution (String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int score = 0;

            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (photo[i][j].equals(name[k])) {
                        score += yearning[k];
                        break;
                    }
                }
            }
            answer[i] += score;
        }
        return answer;
    }
}

public class MemoryScore {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution(new String[] {"may", "kein", "kain", "radi"}, new int[] {5, 10, 1, 3}, new String[][] {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"kali", "mari", "don"}, new int[] {11, 1, 55}, new String[][] {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}})));
        System.out.println(Arrays.toString(s1.solution(new String[] {"may", "kein", "kain", "radi"}, new int[] {5, 10, 1, 3}, new String[][] {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}})));
    }
}

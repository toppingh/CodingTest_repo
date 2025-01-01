package Java.Programmers.Year2024.Day1218;

// Title : 문자열 여러 번 뒤집기
// Q. 문자열 my_string과 이차원 정수 배열 queries가 매개 변수로 주어진다. queries의 원소는 [s, e]형태로, my_string의 인덱스 s부터 e까지를 뒤집으라는 의미다.
// Q. my_string에 queries 명령을 순서대로 처리한 후 문자열을 return하는 solutino 함수

class Solution9 {
    String solution (String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();

        for(int[] i : queries) {
            while (i[0] < i[1]) {
                chars[i[0]] ^= chars[i[1]];
                chars[i[1]] ^= chars[i[0]];
                chars[i[0]] ^= chars[i[1]];

                i[0]++;
                i[1]--;
            }
        }
        return new String(chars);
    }
}

public class TurnSeveralTimes {
    public static void main(String[] args) {
        Solution9 s9 = new Solution9();
        System.out.println(s9.solution("rermgorpsam", new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}

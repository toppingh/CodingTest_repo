package Java.Programmers.Year2025.Mon01.Day0107;

// Title : 세로 읽기
// Q. 문자열 my_string과 두 정수 m, c가 주어질 때, my_string을 한 줄에 m글자씩 가로로 적었을 때 세로로 c번째 열에 적힌 글자들을 문자열로 return하는 solution 함수

class Solution4 {
    String solution (String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int i = c - 1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}

public class ReadHeight {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(s4.solution("programmers", 1, 1));
    }
}

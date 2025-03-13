package Java.Programmers.Year2025.Mon03.Day0313;

// Title : 크기가 작은 부분 문자열
// Q. 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분 문자열 중, 이 부분 문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return 하는 solutino 함수
// Ex. t = "3141592"이고 q = "271"이면, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592다. 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 이다.

import java.util.Arrays;

class Solution3 {
    int solution (String t, String p) {
        int cnt = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                cnt++;
            }
        }
        return cnt;
    }
}

public class StringSmallSize {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("3141592", "271"));
        System.out.println(s3.solution("500220839878", "7"));
        System.out.println(s3.solution("10203", "15"));
    }
}

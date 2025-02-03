package Java.Programmers.Year2025.Mon01.Day0122;

// Title : 왼쪽 오른쪽
// Q. 문자열 리스트 str_list에 u, d, l, r 네개의 문자열이 여러 개 저장되 어있다.
// Q. str_list에서 먼저 나오는 문자열이 l이면 l기준 왼쪽에 있는 문자열을, r이 먼저 나온다면 r을 기준으로 오른쪽에 있는 문자열을 순서대로 담은 리스트를 return한는 solutioh 함수
// Q. l이나 y가 없으면 빈 리스트 return

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

class Solution3 {
    String[] solution (String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[] {};
    }
}

public class LeftRight {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new String[] {"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(s3.solution(new String[] {"l"})));
    }
}

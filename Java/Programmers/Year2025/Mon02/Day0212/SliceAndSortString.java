package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 문자열 잘라서 정렬하기
// Q. myString에서 x를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수
// Q. 단, 빈 문자열은 반환한 배열에 넣지 않는다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    String[] solution (String myString) {
        String[] str = myString.split("x");
        List<String> list = new ArrayList<>();

        for (String s : str) {
            if (!s.isEmpty()) list.add(s);
        }

        list.sort(null); // 기본 정렬

        return list.toArray(new String[0]);
    }
}

public class SliceAndSortString {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution("axbxcxdx")));
        System.out.println(Arrays.toString(s2.solution("dxccxbbbxaaaa")));
        System.out.println(Arrays.toString(s2.solution("zxcxbxaxxxxxxx")));
    }
}

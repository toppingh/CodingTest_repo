package Java.Programmers.Day1220;

// Title : 배열 만들기5
// Q. 문자열 배열 intStrs와 정수 k, s, l이 주어지고, intStrs의 원소는 숫자로 이루어져 있다.
// Q. 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환한다.
// Q. 이때, 변환한 정수값이 k보다 큰 값들을 담은 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    int[] solution (String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {

            if (k < Integer.parseInt(intStrs[i].substring(s, s + l))) {
                list.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class CreateArray5 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5)));
    }
}

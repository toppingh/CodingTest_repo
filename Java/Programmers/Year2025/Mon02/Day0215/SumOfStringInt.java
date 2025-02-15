package Java.Programmers.Year2025.Mon02.Day0215;

// Title : 문자열 정수의 합
// Q. 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return 하는 solutino 함수

class Solution4 {
    int solution (String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }

        return answer;
    }
}

public class SumOfStringInt {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution("123456789"));
        System.out.println(s4.solution("1000000"));
    }
}

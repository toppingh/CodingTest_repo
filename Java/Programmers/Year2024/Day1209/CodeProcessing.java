package Java.Programmers.Year2024.Day1209;

// Title : 코드 처리하기
// Q. 문자열 code가 주어지면 앞에서부터 읽으면서 문자가 "1"일경우 mode를 바꾼다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어낸다.
// Q. mode는 0과 1이 있고, idx를 0부터 code길이 - 1까지 1씩 키워나가면서 code[idx]의 값에 따라 아래와 같이 행동한다.
// Q. mode가 0일 때, code[idx]가 "1"이 아니면, idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가한다. code[idx]가 "1"이면 mode를 0에서 1로 바꾼다.
// Q. mode가 1일 때, code[idx]가 "1"이 아니면 idx가 홀수일때만 ret의 맨 뒤에 code[idx]를 추가하고, code[idx]가 "1"이면 mode를 1에서 0으로 바꾼다.
// 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수

class Solution1 {
    String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else if ((mode == 0) && (i % 2 == 0) || (mode == 1) && (i % 2 != 0)) {
                ret.append(code.charAt(i));
            }
        }

        return ret.isEmpty() ? "EMPTY" : ret.toString();
    }
}

// Solution Code
class SolutionCode1 {
    String solution (String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if (i % 2 == mode) ret.append(c);
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}

public class CodeProcessing {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("abc1abc1abc"));
    }
}

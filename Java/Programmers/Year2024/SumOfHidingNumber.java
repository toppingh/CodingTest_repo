package Java.Programmers.Year2024.Day1215;

// Title : 숨어있는 숫자의 덧셈 (1)
// Q. 문자열 my_string이 매개변수로 주어질 때, my_string안의 모든 자연수들의 합을 return하는 solution 함수

class Solution3 {
    int solution (String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += my_string.charAt(i) - '0';
            }
        }
        return answer;
    }
}

// SolutionCode - 1. 아스키코드 활용  2. replaceAll 예외처리
class SolutionCode3 {
    int solution (String my_string) {
        int answer = 0;

        // 1. 아스키 코드 활용 방법
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer += c - '0';
            }
        }

        // 2. replaceAll 예외처리 방법
        String str = my_string.replaceAll("[^0-9]", "");
        for (char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}

public class SumOfHidingNumber {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("aAb1B2cC34oOp"));
        System.out.println(s3.solution("1a2b3c4d123"));
    }
}

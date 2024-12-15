package Java.Programmers.Day1215;

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

public class SumOfHidingNumber {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("aAb1B2cC34oOp"));
        System.out.println(s3.solution("1a2b3c4d123"));
    }
}

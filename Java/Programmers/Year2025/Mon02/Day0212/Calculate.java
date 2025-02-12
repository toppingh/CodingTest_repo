package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 간단한 식 계산하기
// Q. 문장려 binomial은 a op b 형태으 ㅣ이항식이고 a와 b는 음이 아닌 정수, op는 +, -, * 중 하나이다. 주어진 식을 계산한 정수를 return하는 solution 함수

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution3 {
    int solution (String binomial) {
        String[] answer = binomial.split(" ");

        return switch (answer[1]) {
            case "+" -> Integer.parseInt(answer[0]) + Integer.parseInt(answer[2]);
            case "-" -> Integer.parseInt(answer[0]) - Integer.parseInt(answer[2]);
            case "*" -> Integer.parseInt(answer[0]) * Integer.parseInt(answer[2]);
            default -> 0;
        };
    }
}

public class Calculate {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("43 + 12"));
        System.out.println(s3.solution("0 - 7777"));
        System.out.println(s3.solution("40000 * 40000"));
    }
}

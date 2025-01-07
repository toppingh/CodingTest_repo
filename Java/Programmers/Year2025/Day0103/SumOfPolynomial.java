package Java.Programmers.Year2025.Day0103;

// Title : 다항식 더하기
// Q. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결과값을 문자열로 return하는 solution 함수

import java.util.Arrays;

class Solution3 {
   String solution (String polynomial) {
       StringBuilder sb = new StringBuilder();
       int xSum = 0;
       int sum = 0;

       String[] terms = polynomial.split(" \\+ ");

       for (String s : terms) {
           s = s.trim();

           if (s.contains("x")) {
               if (s.equals("x") || s.equals("-x")) {
                   xSum += (s.equals("x") ? 1 : -1);
               } else {
                   xSum += Integer.parseInt(s.replace("x", ""));
               }
           } else {
               sum += Integer.parseInt(s);
           }
       }

       // x항
       if (xSum != 0) {
           sb.append(xSum == 1 ? "x" : xSum == -1 ? "-x" : xSum + "x");
       }

       // 상수항
       if (sum != 0) {
           if (xSum != 0) sb.append (" + ");
           sb.append(sum);
       }

       // x, 상수항 모두 0
       if (xSum == 0 && sum == 0) {
           return "0";
       }

       return sb.toString();
   }
}

public class SumOfPolynomial {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("3x + 7 + x"));
        System.out.println(s3.solution("x + x + x"));
    }
}

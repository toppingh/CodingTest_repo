package Java.Programmers.Day1223;

// Title : OX퀴즈
// Q. 덧셈, 뺄셈 수식들이 X [연산자] Y = Z 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어진다. 수식이 옳으면 O, 틀리면 X를 순서대로 담은 배열을 return하는 solution 함수

import java.util.Arrays;

class Solution3 {
    String[] solution (String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");
            answer[i] = Integer.parseInt(parts[0]) + (parts[1].equals("+") ? Integer.parseInt(parts[2]) : -Integer.parseInt(parts[2])) == Integer.parseInt(parts[4]) ? "O" : "X";
        }
        return answer;
    }
}

public class OXQuiz {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(s3.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }
}

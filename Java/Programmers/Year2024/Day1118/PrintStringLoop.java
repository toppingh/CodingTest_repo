package me.topping.Programmers.Day1118;

// Title : 문자 반복 출력하기
// Q. 문자열 my_string과 정수 n이 매개변수로 주어질 때 my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하는 solution 함수
class Solution3 {
    String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char text = my_string.charAt(i);

            for (int j = 0; j < n; j++) {
                answer += text;
            }
        }
        return answer;
    }
}


public class PrintStringLoop {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("hello", 3));
    }
}

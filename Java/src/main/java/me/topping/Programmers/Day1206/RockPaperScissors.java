package me.topping.Programmers.Day1206;

// Title : 가위 바위 보
// Q. 가위는 2, 바위는 0, 보는 5로 표현한다. 가위바위보를 내는 순서대로 나타난 문자열 rsp가 매개변수로 주어질 때 모두 이기는 경우를 순서대로 나타낸 문자열을 return 하는 함수

class Solution2 {
    String solution(String rsp) {
        StringBuilder sb = new StringBuilder(rsp.length());

        for (int i = 0; i < rsp.length(); i++) {
            switch (rsp.charAt(i)) {
                case '0' :
                    sb.append("5");
                    break;
                case '2' :
                    sb.append("0");
                    break;
                case '5' :
                    sb.append("2");
                    break;
            }
        }

        return sb.toString();
    }
}

public class RockPaperScissors {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("2"));
        System.out.println(s2.solution("205"));
    }
}

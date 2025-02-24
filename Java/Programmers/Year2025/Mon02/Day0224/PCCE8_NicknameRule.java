package Java.Programmers.Year2025.Mon02.Day0224;

// Title : [PCCE 기출문제] 8번 / 닉네임 규칙
// Q. 사용할 수 없는 닉네임 nickname을 받아 사용할 수 있는 닉네임으로 바꿔주는 solution 함수
// Q. 1. 소문자 l을 대문자 I로 변경한다. 2. 소문자 w를 두 개의 소문자 v, 즉 vv로 변경한다.
// Q. 3. 대문자 W를 두 개의 대문자 V, 즉 VV로 변경한다. 4. 대문자 O를 숫자 0으로 변경한다.
// Q. 5. 수정한 닉네임 길이가 4 미만이면 뒤에 소문자 o를 길이가 4가 될때까지 이어붙인다.
// Q. 6. 수정된 닉네임의 길이가 8보다 클 경우 8번째 문자까지만 사용한다.

class Solution1 {
    String solution (String nickname) {
        String answer = "";
        for (int i = 0; i < nickname.length(); i++) {
            if (nickname.charAt(i) == 'l') {
                answer += "I";
            } else if (nickname.charAt(i) == 'w') {
                answer += "vv";
            } else if (nickname.charAt(i) == 'W') {
                answer += "VV";
            } else if (nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }
        while (answer.length() < 4) {
            answer += "o";
        }

        if (answer.length() > 8) {
            answer = answer.substring(0, 8);
        }

        return answer;
    }
}

public class PCCE8_NicknameRule {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("WORLDworld"));
        System.out.println(s1.solution("GO"));
    }
}

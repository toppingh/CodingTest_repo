package Java.Programmers.Year2025.Mon03.Day0319;

// Title : 시저 암호
// Q. 시저 암호 : 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
// Q. AB 를 1 만큼 밀면 BC, 3만큼 밀면 DE가 된다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호화를 만드는 solution 함수

class Solution1 {
    String solution (String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // z를 넘어갈 경우 순환을 위해 % 26으로 다시 A부터 시작하도록 처리
                sb.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                sb.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

public class CaesarPassword {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("AB", 1));
        System.out.println(s1.solution("z", 1));
        System.out.println(s1.solution("a B z", 4));
    }
}

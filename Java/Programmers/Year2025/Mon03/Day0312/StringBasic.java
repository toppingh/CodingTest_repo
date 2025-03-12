package Java.Programmers.Year2025.Mon03.Day0312;

// Title : 문자열 다루기 기본
// Q. 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 solutino 함수

class Solution1 {
    boolean solution (String s) {
        return (s.length() == 4 || s.length() == 6) && s.chars().allMatch(Character::isDigit);
    }
}

public class StringBasic {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("a123"));
        System.out.println(s1.solution("1234"));
    }
}

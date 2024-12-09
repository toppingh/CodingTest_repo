package me.topping.Programmers.Day1128;

// Title : 문자열 겹쳐쓰기
// Q. 문자열 my_string, overwrite_string과 정수 s가 주어질 때, 문자열 my_string의 인덱스 s 부터 overwrite_string의 길이만큼 문자열 overwrite_string으로 바꾼 문자열 return 하는 solution 함수

class Solution1 {
    String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());

        // Solution Code
//        String before = my_string.substring(0, s);
//        String after = my_string.substring(s + overwrite_string.length());

//        return before + overwrite_string + after;
    }
}

public class OverwritingString {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();

        System.out.println(s1.solution("He11oWor1d", "lloWorl", 2));
        System.out.println(s1.solution("Program29b8UYP", "merS123", 7));
    }
}

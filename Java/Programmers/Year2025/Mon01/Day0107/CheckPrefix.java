package Java.Programmers.Year2025.Mon01.Day0107;

// Title : 접두사인지 확인하기
// Q. 문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1, 아니면 0을 return하는 solution 함수

class Solution2 {
    int solution (String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}

public class CheckPrefix {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("banana", "ban"));
        System.out.println(s2.solution("banana", "nan"));
        System.out.println(s2.solution("banana", "abcd"));
        System.out.println(s2.solution("banana", "bananan"));
    }
}

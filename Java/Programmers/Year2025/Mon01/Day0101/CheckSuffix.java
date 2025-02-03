package Java.Programmers.Year2025.Mon01.Day0101;

// Title : 접미사인지 확인하기
// Q. 문자열 my_string과 is_suffix가 주어질 떄, is_suffix가 my_string의 접미사라면 1, 아니면 0을 return하는 solution 함수

class Solution3 {
    int solution (String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}


public class CheckSuffix {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("banana", "ana"));
        System.out.println(s3.solution("banana", "nan"));
        System.out.println(s3.solution("banana", "wxyz"));
        System.out.println(s3.solution("banana", "abanana"));
    }
}

package Java.Programmers.Year2025.Day0107;

// Title : 문자열 뒤집기
// Q. 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 e까지를 뒤집은 문자열을 return하는 solution 함수

class Solution3 {
    String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        sb.append(my_string, 0, s);

        for (int i = e + 1; i > s; i--) {
            sb.append(my_string.charAt(i - 1));
        }
        sb.append(my_string.substring(e + 1));
        return sb.toString();
    }
}

// SolutionCode -> reverse() 활용
class SolutionCode3 {
    String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        return my_string.substring(0, s) + sb + my_string.substring(e + 1);
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        SolutionCode3 sc3 = new SolutionCode3();

        System.out.println(s3.solution("Progra21Sremm3", 6, 12));
        System.out.println(s3.solution("Stanley1yelnatS", 4, 10));
        System.out.println(s3.solution("49gh43jOIQvkSH", 5, 5));
        System.out.println();

        System.out.println(sc3.solution("Progra21Sremm3", 6, 12));
        System.out.println(sc3.solution("Stanley1yelnatS", 4, 10));
        System.out.println(sc3.solution("49gh43jOIQvkSH", 5, 5));

    }
}

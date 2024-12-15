package Java.Programmers.Day1215;

// Title : 모음 제거
// Q. 영어에서 a, e, i, o u 다섯가지 알파벳을 모음으로 분류한다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return 하는 solution 함수

class Solution1 {
    String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' ||
            sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}


public class RemoveVowel {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("bus"));
        System.out.println(s1.solution("nice to meet you"));
    }
}

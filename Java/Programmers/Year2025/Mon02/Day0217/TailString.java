package Java.Programmers.Year2025.Mon02.Day0217;

// Title : 꼬리 문자열
// Q. 문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return 하는 solution 함수

class Solution2 {
    String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for (String s : str_list) {
            if (!s.contains(ex)) {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}

public class TailString {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(s2.solution(new String[]{"abc", "bbc", "cbc"}, "c"));

    }
}

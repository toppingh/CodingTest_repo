package Java.Programmers.Year2025.Mon02.Day0211;

// Title : 문자열이 몇 번 등장하는지 세기
// Q. 문자열 myString과 pat이 주어질 때, myString에서 pat이 등장하는 횟수를 return 하는 solution 함수

class Solution2 {
    int solution (String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.startsWith(pat, i)) answer++;
        }
        return answer;
    }
}

public class CountString {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("banana", "ana"));
        System.out.println(s2.solution("aaaa", "aa"));
    }
}

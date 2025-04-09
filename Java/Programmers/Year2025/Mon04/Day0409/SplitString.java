package Java.Programmers.Year2025.Mon04.Day0409;

// Title : 문자열 나누기
// Q. 문자열 s 입력시 아래 규칙을 따라 문자열을 여러 문자열로 분해한다.
// Q. 첫 글자를 x라고 하고 이 문자열을 왼쪽에서 오른쪽으로 읽어나가며 x와 x가 아닌 다른 글자들이 나온 횟수를 각각 센다.
// Q. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리한다.
// Q. s에서 분리한 문자열을 빼고 남은 부분에 대해 이 과정을 반복하고 남은 부분이 없으면 종료한다.
// Q. 만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없으면 지금까지 읽은 문자열을 분리하고 종료한다.
// Q. 문자열 s가 매개변수로 주어질 때 위 과정을 따라 문자열들로 분해하고, 분해한 문자열 개수를 return 하는 solution 함수

class Solution1 {
    int solution (String s) {
        int answer = 0, same = 0, diff = 0;
        char idx = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == idx) {
                same++;
            } else {
                diff++;
            }

            if (same == diff) {
                answer++;

                if (i + 1 < s.length()) {
                    idx = s.charAt(i + 1);
                }
                same = 0;
                diff = 0;
            }
        }

        if (same != 0 || diff != 0) {
            answer++;
        }

        return answer;
    }
}

public class SplitString {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("banana"));
        System.out.println(s1.solution("abracadabra"));
        System.out.println(s1.solution("aaabbaccccabba"));
    }
}

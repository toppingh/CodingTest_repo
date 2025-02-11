package Java.Programmers.Year2025.Mon02.Day0210;

// Title : A로 B만들기
// Q. before와 after가 매개변수로 주어질 때 before 순서를 바꿔 after를 만들 수 있으면 1, 없으면 0을 return하는 solution 함수

class Solution6 {
    int solution (String before, String after) {
        int[] cnt = new int[26];

        for (char c : before.toCharArray()) {
            cnt[c - 'a']++;
        }

        for (char c : after.toCharArray()) {
            cnt[c - 'a']--;
        }

        for (int i : cnt) {
            if (i != 0) return 0;
        }

        return 1;
    }
}

public class MakeBWithA {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        System.out.println(s6.solution("olleh", "hello"));
        System.out.println(s6.solution("allpe", "apple"));
    }
}

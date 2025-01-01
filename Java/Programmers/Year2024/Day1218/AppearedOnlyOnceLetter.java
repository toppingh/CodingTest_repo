package Java.Programmers.Year2024.Day1218;

// Title : 한 번만 등장한 문자
// Q. 문자열 s가 매개변수로 주어질 때, s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하는 solution 함수
// Q. 한번만 등장하는 문자가 없을 경우 빈 문자열 return

class Solution3 {
    String solution (String s) {
        int[] freq = new int[26]; // 알파벳 빈도수 (a ~ z)
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // 알파벳 a 아스키 코드값 기준으로 배열 인덱스 -> 빈도 증가
//            System.out.println(c + " : " + freq[c - 'a']);
        }

        for(int i = 0; i < 26; i++) {
            if (freq[i] == 1) sb.append((char) (i + 'a'));
        }
        return sb.toString();
    }
}

public class AppearedOnlyOnceLetter {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("abcabcadc"));
        System.out.println(s3.solution("abdc"));
        System.out.println(s3.solution("hello"));
    }
}

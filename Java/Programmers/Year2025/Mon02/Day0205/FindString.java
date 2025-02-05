package Java.Programmers.Year2025.Mon02.Day0205;

// Title : 원하는 문자열 찾기
// Q. 알파벳으로 이루어진 문자열 myString과 pat이 주어질 떄, myString의 연속된 부분 문자열 중 pat이 존재하면 1, 그렇지 않으면 0을 return 하는 solution 함수

class Solution3 {
    int solution (String myString, String pat) {
        for(int i = 0; i < myString.length(); i++) {
            if(myString.toLowerCase().contains(pat.toLowerCase())) {
                return 1;
            }
        }
        return 0;
    }
}

public class FindString {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution("AbCdEfG", "aBc"));
        System.out.println(s3.solution("aaAA", "aaaaa"));
    }
}

package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 문자열 바꿔서 찾기
// Q. 문자 A와 B로 이루어진 myString과 pat이 주어진다. myString의 A는 B로 B는 A로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1, 아니면 0을 return 하는 solution 함수

class Solution4 {
    int solution (String myString, String pat) {
        String str = "";

        for (int i = 0; i < myString.length(); i++) {
            str += myString.charAt(i) == 'A' ? 'B' : 'A';
        }

        return str.contains(pat) ? 1 : 0;
    }
}

// SolutionCode -> replace와 a활용
class SolutionCode4 {
    int solution (String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}

public class FindBySwitchingString {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        SolutionCode4 sc4 = new SolutionCode4();

        System.out.println(s4.solution("ABBAA", "AABB"));
        System.out.println(s4.solution("ABAB", "ABAB"));
        System.out.println();
        System.out.println(sc4.solution("ABBAA", "AABB"));
        System.out.println(sc4.solution("ABAB", "ABAB"));
    }
}

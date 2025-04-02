package Java.Programmers.Year2025.Mon04.Day0402;

// Title : 옹알이 (2)
// Q. 문자열 배열 babbling이 매개변수로 주어질 때 발음할 수 있는 단어의 개수를 return 하는 solution 함수
// "aya", "ye", "woo", "ma" 만 발음 가능

class Solution2 {
    int solution (String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.matches("^(" + "aya|ye|woo|ma" + ")+$") && !s.matches(".*(ayaaya|yeye|woowoo|mama).*")) answer++;
        }
        return answer;
    }
}

public class Babbling_2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new String[] {"aya", "yee", "u", "maa"}));
        System.out.println(s2.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}

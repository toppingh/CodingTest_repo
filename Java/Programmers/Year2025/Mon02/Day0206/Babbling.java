package Java.Programmers.Year2025.Mon02.Day0206;

// Title : 옹알이 (1)
// Q. 문자열 배열 babbling이 매개변수로 주어질때, 발음할 수 있는 단어의 개수를 return 하는 solution 함수
// Q. aya, ye, woo, ma 네 가지 발음을 최대 한 번씩 사용해 조합(이어붙인) 발음만 할 수 있다.

class Solution3 {
    int solution (String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            if (s.matches("^(aya|ye|woo|ma)+$")) answer++;
        }

        return answer;
    }
}

public class Babbling {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(s3.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}

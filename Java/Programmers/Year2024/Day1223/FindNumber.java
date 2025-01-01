package Java.Programmers.Year2024.Day1223;

// Title : 숫자 찾기
// Q. 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중 k가 있으면 num의 그 숫자가 있는 자리수를 return 하고 없으면 -1을 return하는 solution 함수

class Solution1 {
    int solution (int num, int k) {
        String str = "" + num;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' == k) return i + 1;
        }
        return -1;
    }
}

// SolutionCode1 -> indexOf 활용
class SolutionCode1 {
    int solution (int num, int k) {
        // "-"를 추가해 인덱스를 1부터 카운트
        return ("-" + num).indexOf(String.valueOf(k));
    }
}

public class FindNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        Solution1 sc1 = new Solution1();

        System.out.println(s1.solution(29183, 1));
        System.out.println(s1.solution(232443, 4));
        System.out.println(s1.solution(123456, 7));
        System.out.println();

        System.out.println(sc1.solution(29183, 1));
        System.out.println(sc1.solution(232443, 4));
        System.out.println(sc1.solution(123456, 7));
    }
}

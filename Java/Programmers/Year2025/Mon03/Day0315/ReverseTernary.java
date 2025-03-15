package Java.Programmers.Year2025.Mon03.Day0315;

// Title : 3진법 뒤집기
// Q. 자연수 n이 매개변수일 때, n을 3진법 상에서 앞뒤로 뒤집은 후 다시 10진법으로 표현한 수를 return 하는 solution 함수

class Solution1 {
    int solution (int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        for (int i = 1; i <= sb.length(); i++) {
            sum += Integer.parseInt(String.valueOf(sb.charAt(sb.length() - i))) * Math.pow(3, i - 1);
        }
        return sum;
    }
}

// SolutionCode1
class SolutionCode1 {
    int solution (int n) {
        String a = "";

        while (n > 0) {
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a, 3);
    }
}

public class ReverseTernary {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        SolutionCode1 sc1 = new SolutionCode1();

        System.out.println(s1.solution(45));
        System.out.println(s1.solution(125));
        System.out.println();
        System.out.println(sc1.solution(45));
        System.out.println(sc1.solution(125));
    }
}

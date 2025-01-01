package Java.Programmers.Year2024.Day1209;

// Title : 주사위 게임2
// Q. 주사위 세 개를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수를 return 하는 solution 함수
// Q. 숫자 세개가 모두 다르면 a + b + c점, 숫자 하나만 다르면 (a + b + c) * (a^2 + b^2 + c^2)점, 모두 같으면 (a + b + c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3)점

class Solution4 {
    int solution (int a, int b, int c) {
        int sum = a + b + c;
        int sum2 = a * a + b * b + c * c;
        int sum3 = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            return sum * sum2 * sum3;
        } else if (a == b || b == c || c == a) {
            return sum * sum2;
        } else {
            return sum;
        }
    }
}

// 솔루션 코드 -> 오버라이딩
class SolutionCode4 {
    int solution (int a, int b, int c) {
        int answer = 1;
        int cnt = 1;

        if (a == b || b == c || c == a) cnt++; // 두 숫자만 같을 경우 1 증가
        if (a == b && b == c) cnt++; // 모두 같을 경우 1 증가 (총 2 증가)

        for (int i = 1; i <= cnt; i++) { // cnt 값에 따른 계산 반복
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }

        return answer;
    }

    private int pow(int a, int b) { // 재귀적 제곱 계산 메서드
        if (b == 0) return 1;
        return a * pow(a, b - 1); // a를 b - 1번 곱함
    }
}

public class DiceGame2 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(2, 6, 1));
        System.out.println(s4.solution(5, 3, 3));
        System.out.println(s4.solution(4, 4, 4));
    }
}

package Java.Programmers.Year2025.Mon03.Day0311;

// Title : 부족한 금액 계산하기
// Q. 이용료는 price원인데, 놀이기구를 N번째 이용하면 원래 이용료의 n배를 받는다. count번 타게 되면 현재 갖고있는 금액에서 얼마가 모자라는지 return 하는 solution 함수
// Q. 단, 금액이 부족하지 않으면 0 return

class Solution3 {
    long solution (int price, int money, int count) {
        int sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
//        System.out.println(sum);
        return sum - money > 0 ? sum - money : 0;
    }
}

// SolutionCode3 -> 등차수열의 합 공식 활용
class SolutionCode3 {
    long solution (int price, int money, int count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}

public class CalculateLackOfMoney {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        SolutionCode3 sc3 = new SolutionCode3();

        System.out.println(s3.solution(3, 20, 4));
        System.out.println();
        System.out.println(sc3.solution(3, 20, 4));
    }
}

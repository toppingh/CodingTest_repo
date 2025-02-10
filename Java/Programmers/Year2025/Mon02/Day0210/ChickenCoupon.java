package Java.Programmers.Year2025.Mon02.Day0210;

// Title : 치킨 쿠폰
// Q. 쿠폰 열장에 치킨 한 마리 서비스이며, 서비스 치킨에도 쿠폰이 발급된다. 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 치킨의 수를 return하는 solution함수

class Solution4 {
    int solution (int chicken) {
        int cnt = 0;

        while (chicken >= 10) {
            cnt += chicken / 10;
            chicken = chicken / 10 + (chicken % 10);
        }
        return cnt;
    }
}

// SolutionCode4 -> 반복문 x
class SolutionCode4 {
    int solution (int chicken) {
        int answer = chicken / 9; // 10장에 치킨 1마리가 공짜이므로 9마리 시키면 1마리 공짜, 9 / 9 = 1

        // chicken > 1 : 첫 주문 시 10마리 값을 모두 지불해야만 서비스 닭을 받을 수 있다.
        // chicken % 9 : 9로 딱 나눠떨어질 경우 마지막 한마리 값을 더 지불해야 한다.
        if (chicken > 1 && chicken % 9 == 0) {
            answer--;
        }
        return answer;
    }
}

public class ChickenCoupon {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        SolutionCode4 sc4 = new SolutionCode4();

        System.out.println(s4.solution(100));
        System.out.println(s4.solution(1081));
        System.out.println(s4.solution(199));
        System.out.println();
        System.out.println(sc4.solution(100));
        System.out.println(sc4.solution(1081));
        System.out.println(sc4.solution(199));
    }
}

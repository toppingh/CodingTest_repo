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

public class ChickenCoupon {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(100));
        System.out.println(s4.solution(1081));
    }
}

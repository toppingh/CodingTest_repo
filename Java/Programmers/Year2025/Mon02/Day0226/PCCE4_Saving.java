package Java.Programmers.Year2025.Mon02.Day0226;

// Title : [PCCE 기출문제] 4번 / 저축
// Q. 목표 금액은 100만원이며, 첫 달에 일정 금액을 넣은 뒤 70만원 까지는 매월 조금씩 저축하다가 70만원 이후부터는 월 저축량을 늘려 빠르게 목표 금액을 달성하려 함
// Q. 첫 달에 저축하는 금액을 나타내는 정수 start, 둘째 달부터 70만원 이상 모일떄까지 매월 저축하는 금액을 나타내는 정수 before
// Q. 100만원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 after가 주어진다.
// Q. 100만원 이상을 모을 때까지 걸리는 개월 수를 출력하는 코드

import java.util.Scanner;

public class PCCE4_Saving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }

        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}

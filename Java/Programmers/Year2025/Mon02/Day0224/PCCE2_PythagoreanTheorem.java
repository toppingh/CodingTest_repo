package Java.Programmers.Year2025.Mon02.Day0224;

// Title : [PCCE 기출문제] 2번 / 피타고라스 정리
// Q. 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square를 출력하는 코드

import java.util.Scanner;

public class PCCE2_PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c - a) * (c + a); // 합차공식
        System.out.println(b_square);
    }
}

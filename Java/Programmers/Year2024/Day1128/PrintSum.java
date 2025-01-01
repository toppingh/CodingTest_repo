package me.topping.Programmers.Day1128;

// Title : 덧셈식 출력하기
// Q. 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드 -> a + b = c

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " + " + b + " = " + (a + b));

        // Solution Code
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}

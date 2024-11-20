package me.topping.Programmers.Day1120;

import java.util.Scanner;

// Title : 직각 삼각형 출력하기
// Q. *의 높이와 너비를 1이라고했을 때, *을 이용해 직각 이등변 삼각형을 그리려고 한다. 정수 n이 주어지면 높이와 너비가 n인 직각 이등변 삼각형을 출력하는 코드
// 제한. 1 <= n <= 10


public class PrintRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

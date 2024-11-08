package me.topping.BaekJoon.Day1108;

// Title : 구구단
// Q. N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램
// Input : 첫째 줄에 N, 1보다 크거나 같고 9보다 작거나 같다.
// Output : N * 1 무터 N * 9까지 출력

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }

    }
}

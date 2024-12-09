package me.topping.Programmers.Day1125;

// Title : a와 b 출력하기
// Q. 정수 a와 b가 주어질 때 각 수를 입력받아 a = 입력값 b = 입력값 형식으로 출력하는 코드

import java.util.Scanner;

public class PrintAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
